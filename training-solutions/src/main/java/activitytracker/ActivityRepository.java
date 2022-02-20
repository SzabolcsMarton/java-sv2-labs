package activitytracker;

import activity.ActivityType;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    private DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long saveActivity(LocalDateTime startTime, String desc, Type type){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt =
                    connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)",
                            Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1,Timestamp.valueOf(startTime));
            stmt.setString(2, desc);
            stmt.setString(3,type.toString());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getLong(1);
                }
                throw new IllegalStateException("Cannot insert and get id");
            }

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot update: ", sqle);
        }
    }

    public Activity findActivityById(int activity_id){
        Activity activity = null;
        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM activities WHERE id= ?")){
            stmt.setString(1, String.valueOf(activity_id));

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                    String desc = rs.getString("activity_desc");
                    Type type = Type.valueOf(rs.getString("activity_type"));
                    activity = new Activity(id,startTime,desc,type);
                }else{
                    throw new IllegalStateException("Cannot find activity with id: " + activity_id);
                }
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!",sqle);
        }
        return activity;
    }

    public List<Activity> listActivities(){
        List<Activity> result = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM activities")){

            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                    String desc = rs.getString("activity_desc");
                    Type type = Type.valueOf(rs.getString("activity_type"));
                    result.add(new Activity(id,startTime,desc,type));
                }
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!",sqle);
        }
        return result;
    }
}
