package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    Day day;

    @BeforeEach
    void initHours(){
        day = new Day();
        day.addHour(new Hour(4));
        day.addHour(new Hour(10));
        day.addHour(new Hour(22));
    }

    @Test
    void testSetDayPeriod(){
        day.setDayPeriod();
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(2).getPeriod());
    }

}