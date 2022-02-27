package activitytrackertemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ActivityRepository {

    JdbcTemplate jdbcTemplate;

    public ActivityRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveActivity(Activity activity) {
        jdbcTemplate.update("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)",
                activity.getStartTime(), activity.getDescription(), activity.getActivityType().toString());
    }

    public void saveActivities(List<Activity> activities) {
        for (Activity actual : activities) {
            saveActivity(actual);
        }
    }

    public long saveActivityGetGeneratedKey(Activity activity) {
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement prepStmt = con.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            setupStatement(prepStmt, activity);

            return prepStmt;
        }, holder);

        return Objects.requireNonNull(holder.getKey()).longValue();
    }

    @Transactional
    public void saveActivityWithTrackpoints(Activity activity) {
        long id = saveActivityGetGeneratedKey(activity);
        saveActivityAndTrackpointsWithId(id, activity.getTrackPoints());

    }

    public Activity findActivityById(long id) {
        return jdbcTemplate.queryForObject("select * from activities where id=?", (rs, rowNum) -> new Activity(rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type"))), id);
    }

    public Activity findActivityByIdWithTrackpoints(long id) {
        Activity foundActivity = findActivityById(id);
        List<TrackPoint> trackPoints = listTrackpointsById(id);
        return new Activity(id, foundActivity.getStartTime(), foundActivity.getDescription(), foundActivity.getActivityType(), trackPoints);
    }

    public List<Activity> listActivities() {
        List<Activity> activities = new ArrayList<>();
        jdbcTemplate.query("select * from activities", (rs, i) -> activities.add(createActivity(rs)));

        return activities;
    }

    private void saveActivityAndTrackpointsWithId(long id, List<TrackPoint> trackPoints) {
        for (TrackPoint actual : trackPoints) {
            if (actual.getLat() < -90.0 || actual.getLat() > 90.0 || actual.getLon() < -180 || actual.getLon() > 180.0) {
                throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
            }
            jdbcTemplate.update("insert into track_point(id,tp_time,lat,lon) values(?,?,?,?)",
                    id, Date.valueOf(actual.getTime()), actual.getLat(), actual.getLon());
        }

    }

    private List<TrackPoint> listTrackpointsById(long id) {
        List<TrackPoint> trackPoints = new ArrayList<>();
        jdbcTemplate.query("select * from track_point where id=?", ((rs, i) -> trackPoints.add(createTrackpoint(rs, id))), id);

        return trackPoints;
    }

    private TrackPoint createTrackpoint(ResultSet rs, long id) throws SQLException {
        LocalDate time = rs.getDate("tp_time").toLocalDate();
        double lat = rs.getDouble("lat");
        double lon = rs.getDouble("lon");

        return new TrackPoint(id, time, lat, lon);
    }

    private Activity createActivity(ResultSet rs) throws SQLException {
        return new Activity(rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
    }

    private void setupStatement(PreparedStatement prepStmt, Activity activity) throws SQLException {
        prepStmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        prepStmt.setString(2, activity.getDescription());
        prepStmt.setString(3, activity.getActivityType().toString());
    }

}
