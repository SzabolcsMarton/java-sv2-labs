package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    private DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);")) {
            setupStatement(prepStmt, activity);
            prepStmt.executeUpdate();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activity", sqle);
        }
    }

    public void saveActivities(List<Activity> activities) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);")) {
            for (Activity actual : activities) {
                setupStatement(prepStmt, actual);
                prepStmt.executeUpdate();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activities", sqle);
        }
    }

    public Activity saveActivityReturnActivityWithGeneratedKeys(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);",
                     Statement.RETURN_GENERATED_KEYS)) {
            setupStatement(prepStmt, activity);
            prepStmt.executeUpdate();
            ResultSet rs = prepStmt.getGeneratedKeys();
            if (rs.next()) {
                return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDescription(), activity.getType());
            }
            throw new IllegalStateException("Cannot get activity with generated keys");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert Activity", sqle);
        }
    }

    private long saveActivityAndReturnGeneratedKey(Activity activity, Connection conn) {
        try (PreparedStatement prepStmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?, ?, ?);",
                Statement.RETURN_GENERATED_KEYS)) {
            setupStatement(prepStmt, activity);
            prepStmt.executeUpdate();
            return idFromResultset(prepStmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert Activity", sqle);
        }
    }

    private long idFromResultset(PreparedStatement prepStmt) {
        long activityId = 0;
        try (ResultSet rs = prepStmt.getGeneratedKeys()) {
            if (rs.next()) {
                activityId = rs.getLong(1);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot get generated keys");
        }

        return activityId;
    }


    private void saveTrackpoints(long activityId, Activity activity, Connection conn) throws SQLException {
        try (PreparedStatement prepStmt = conn.prepareStatement("insert into track_point(id,tp_time,lat,lon) values(?,?,?,?)")) {
            for (TrackPoint actual : activity.getTrackpoints()) {
                if (actual.getLat() < -90.0 || actual.getLat() > 90.0 || actual.getLon() < -180 || actual.getLon() > 180.0) {
                    throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
                }
                prepStmt.setLong(1, activityId);
                prepStmt.setDate(2, Date.valueOf(actual.getTime()));
                prepStmt.setDouble(3, actual.getLat());
                prepStmt.setDouble(4, actual.getLon());
                prepStmt.executeUpdate();
            }
        }
    }

    public void saveActivityAndSaveTrackpoints(Activity activity) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try {
                long activityId = saveActivityAndReturnGeneratedKey(activity, conn);
                saveTrackpoints(activityId, activity, conn);
                conn.commit();
            } catch (Exception exception) {
                conn.rollback();
                throw new IllegalStateException("Transaction failed", exception);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect", sqle);
        }
    }

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("select * from activities where id=?")) {
            prepStmt.setLong(1, id);
            try (ResultSet rs = prepStmt.executeQuery()) {
                if (rs.next()) {
                    return new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), Type.valueOf(rs.getString("activity_type")));
                }
                throw new IllegalStateException("Cannot find Activity with id: " + id);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query Activity with id: " + id, sqle);
        }
    }

    public Activity findActivityWithTrackpointsById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement prepStmt = conn.prepareStatement("select * from activities where id=?")) {
            prepStmt.setLong(1, id);
            return createActivityById(id,prepStmt,conn);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find activity with id: "+id, sqle);
        }

    }

    private Activity createActivityById(long id, PreparedStatement prepStmt, Connection conn) throws SQLException {
        try (ResultSet rs = prepStmt.executeQuery()) {
            if (rs.next()) {
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String description = rs.getString("activity_desc");
                Type type = Type.valueOf(rs.getString("activity_type"));
                List<TrackPoint> trackpoints = getAndAddTrackpointsToList(id, conn);
                return new Activity(id,startTime,description,type,trackpoints);
            }
        }

        throw new IllegalStateException("Cannot create activity");
    }


    private List<TrackPoint> getAndAddTrackpointsToList(long id, Connection conn) {
        try (PreparedStatement prepStmt = conn.prepareStatement("select * from track_point where id=?")) {
            prepStmt.setLong(1, id);
            return getTrackpointsFromResultset(prepStmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot get trackpoints",sqle);
        }

    }

    private List<TrackPoint> getTrackpointsFromResultset(PreparedStatement prepStmt) {
        List<TrackPoint> trackpoints = new ArrayList<>();
        try (ResultSet rs = prepStmt.executeQuery()) {
            while (rs.next()) {
                trackpoints.add(createTrackpoint(rs));
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot get trackpoints", sqle);
        }
        return trackpoints;
    }


    private TrackPoint createTrackpoint(ResultSet rs) throws SQLException {
        LocalDate time = rs.getDate("tp_time").toLocalDate();
        double lat = rs.getDouble("lat");
        double lon = rs.getDouble("lon");

        return new TrackPoint(time, lat, lon);
    }


    public List<Activity> listActivities() {
        List<Activity> activities = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("select * from activities")) {
            while (rs.next()) {
                activities.add(new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"),
                        Type.valueOf(rs.getString("activity_type"))));
            }
            return activities;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query activities", sqle);
        }
    }

    private void setupStatement(PreparedStatement prepStmt, Activity activity) throws SQLException {
        prepStmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        prepStmt.setString(2, activity.getDescription());
        prepStmt.setString(3, activity.getType().toString());
    }

}
