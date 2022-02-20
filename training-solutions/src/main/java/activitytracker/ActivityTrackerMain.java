package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        Activity firstActivity = new Activity(1, LocalDateTime.of(2021, 8, 5, 15, 00, 00),
                "kiranulas", Type.HIKING);
        Activity secondActivity = new Activity(2, LocalDateTime.of(2021, 8, 15, 16, 00, 00),
                "kosarazas", Type.BASKETBALL);
        Activity thirdActivity = new Activity(3, LocalDateTime.of(2021, 8, 15, 18, 00, 00),
                "futkosas", Type.RUNNING);
        Activity fourthActivity = new Activity(4, LocalDateTime.of(2021, 8, 16, 18, 00, 00),
                "bringazas", Type.BIKING);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        ActivityRepository activityRepository = new ActivityRepository(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        //flyway.clean();
        flyway.migrate();

        System.out.println(activityRepository.saveActivity(firstActivity.getStartTime(), firstActivity.getDesc(), firstActivity.getType()));
//        activityRepository.saveActivity(secondActivity.getStartTime(), secondActivity.getDesc(), secondActivity.getType());
//        activityRepository.saveActivity(thirdActivity.getStartTime(), thirdActivity.getDesc(), thirdActivity.getType());
//        activityRepository.saveActivity(fourthActivity.getStartTime(), fourthActivity.getDesc(), fourthActivity.getType());

     // System.out.println(activityRepository.findActivityById(2).toString());
     //   System.out.println(activityRepository.findActivityById(6).toString());

//        List<Activity> activities_list = activityRepository.listActivities();
//        System.out.println(activities_list);
    }


}
