package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityRepositoryTest {

    ActivityRepository repository;

    @BeforeEach
    void setUp() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        repository = new ActivityRepository(dataSource);


        Activity activity = new Activity(LocalDateTime.of(2021, 8, 14, 18, 00, 00),
                "bringazas", Type.BIKING);

        repository.saveActivity(activity);

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

        repository.saveActivities(activities);

    }

    @Test
    void findActivityByIdTest(){
        Activity activity = repository.findActivityById(4);

        assertEquals("futkosas", activity.getDescription());
    }

    @Test
    void findActivityByIdShouldThrowExeption(){
        Exception exception = assertThrows(IllegalStateException.class, () -> repository.findActivityById(7));
        assertEquals("Cannot find Activity with id: 7", exception.getMessage());
    }

    @Test
    void listActivitiesTest(){
        List<Activity> testActivities = repository.listActivities();

        assertEquals(5,testActivities.size());
    }
    @Test
    void testSaveActivityAndReturnGeneratedKeys() {
        Activity activity = new Activity(LocalDateTime.of(2020, 5, 12, 10, 00), "futkosas", Type.RUNNING);
        Activity expected = repository.saveActivityReturnActivityWithGeneratedKeys(activity);

        assertEquals(6, expected.getId());
    }

    @Test
    void saveTrackPointsTest(){
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        TrackPoint trackPoint6 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
        Activity activityWithTrackpoints = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", Type.RUNNING, trackpoints);

        repository.saveActivityAndSaveTrackpoints(activityWithTrackpoints);
    }
    @Test
    void testSaveActivitywithTrackPointsSomethingIsWrong() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 15238.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4);
        Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", Type.RUNNING, trackpoints);

        Exception ex = assertThrows(IllegalStateException.class, () -> repository.saveActivityAndSaveTrackpoints(activity));
        assertEquals("Transaction failed", ex.getMessage());


    }

}