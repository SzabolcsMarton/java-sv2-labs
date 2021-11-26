package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();

    @Test
    void logFieldPointsTest() {
        LocalDateTime logTime = LocalDateTime.of(2021, 8, 10, 12, 14);
        hikingTour.logFieldPoints(logTime,
                new FieldPoint(LocalDateTime.of(2021, 8, 7, 10, 14), 10.223902, 15.453267),
                new FieldPoint(LocalDateTime.of(2021, 8, 7, 12, 55), 10.213214, 15.653237),
                new FieldPoint(LocalDateTime.of(2021, 8, 7, 15, 36), 10.202546, 15.692367),
                new FieldPoint(LocalDateTime.of(2021, 8, 7, 15, 55), 10.203178, 15.756487));

        assertEquals(4, hikingTour.getFieldPoints().size());
        assertEquals(15.692367, hikingTour.getFieldPoints().get(2).getLongitude());
        assertEquals(logTime, hikingTour.getFieldPoints().get(0).getTimeOfLogging());

    }

    @Test
    void logFieldPointsWithNullLogTimeTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> hikingTour.logFieldPoints(null,
                        new FieldPoint(LocalDateTime.of(2021, 8, 7, 10, 14), 10.223902, 15.453267),
                        new FieldPoint(LocalDateTime.of(2021, 8, 7, 12, 55), 10.213214, 15.653237)));
        assertEquals("You have to give te time of the Logging",exception.getMessage());
    }
}