package activitytrackertemplate;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityMain {

    public static void main(String[] args) {
        Activity activity = new Activity(LocalDateTime.of(2021, 8, 14, 18, 00, 00),
                "bringazas", ActivityType.BIKING);

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytrackertemplate?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        ActivityRepository activityRepository = new ActivityRepository(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

        activityRepository.saveActivity(activity);
        activityRepository.saveActivity(activity);
        activityRepository.saveActivity(activity);

        System.out.println(activityRepository.findActivityById(3));

        System.out.println(activityRepository.listActivities().size());

        System.out.println(activityRepository.saveActivityGetGeneratedKey(activity));

    }


}
