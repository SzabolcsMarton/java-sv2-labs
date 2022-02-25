package activitytracker;

import activity.ActivityType;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        Activity activity = new Activity(LocalDateTime.of(2021, 8, 14, 18, 00, 00),
                "bringazas", Type.BIKING);

        List<Activity> activities = new ArrayList<>();

        Activity firstActivity = new Activity(LocalDateTime.of(2021, 8, 5, 15, 00, 00),
                "kiranulas", Type.HIKING);
        Activity secondActivity = new Activity(LocalDateTime.of(2021, 8, 15, 16, 00, 00),
                "kosarazas", Type.BASKETBALL);
        Activity thirdActivity = new Activity(LocalDateTime.of(2021, 8, 15, 18, 00, 00),
                "futkosas", Type.RUNNING);
        Activity fourthActivity = new Activity(LocalDateTime.of(2021, 8, 16, 18, 00, 00),
                "bringazas", Type.BIKING);

        activities.add(firstActivity);
        activities.add(secondActivity);
        activities.add(thirdActivity);
        activities.add(fourthActivity);

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

        ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();
//        ActivityRepository activityRepository = new ActivityRepository(dataSource);

        activityTrackerMain.saveActivity(dataSource,activity);
        //activityTrackerMain.saveActivities(dataSource,activities);
//        List<Activity> activitiesFromDb = activityTrackerMain.listActivities(dataSource);
//        for (Activity actual : activitiesFromDb) {
//            System.out.println(activityTrackerMain.findActivityById(actual.getId(), dataSource));
//        }


    }

    public void saveActivity(DataSource dataSource, Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)")) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preparedStatement.setString(2, activity.getDescription());
            preparedStatement.setString(3, activity.getType().toString());
            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot  insert activity", sqle);
        }
    }

    public void saveActivities(DataSource dataSource, List<Activity> activities) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)")) {
            for (Activity actual : activities) {
                preparedStatement.setTimestamp(1, Timestamp.valueOf(actual.getStartTime()));
                preparedStatement.setString(2, actual.getDescription());
                preparedStatement.setString(3, actual.getType().toString());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot  insert activities", sqle);
        }
    }

    public List<Activity> listActivities(DataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from activities")) {
            return createListFromResultSet(resultSet);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query ", sqle);
        }
    }

    public Optional<Activity> findActivityById(long id, DataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("select * from activities where id=? ")) {
            prepStmt.setLong(1, id);
            try (ResultSet rs = prepStmt.executeQuery()) {
                return createActivity(rs);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find activity by id: " + id, sqle);
        }
    }

    private Optional<Activity> createActivity(ResultSet rs) throws SQLException {
        if (rs.next()) {
            Activity result = new Activity(rs.getLong("id"),
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("activity_desc"),
                    Type.valueOf(rs.getString("activity_type")));
            rs.close();
            return Optional.of(result);
        } else {
            rs.close();
            return Optional.empty();
        }
    }

    private List<Activity> createListFromResultSet(ResultSet rs) throws SQLException {
        List<Activity> result = new ArrayList<>();
        while (rs.next()) {
            result.add(new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type"))));
        }
        return result;
    }

}
