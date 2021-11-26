package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void createFieldPointTest(){
        LocalDateTime time = LocalDateTime.of(2020,8,5,15,20);
        FieldPoint fieldPoint = new FieldPoint(time,10.2545,15.2565);
        LocalDateTime logTime = LocalDateTime.of(2020,8,5,15,20);
        fieldPoint.setTimeOfLogging(logTime);

        assertEquals(logTime, fieldPoint.getTimeOfLogging());
        assertEquals(10.2545, fieldPoint.getLatitude());
        assertEquals(15.2565, fieldPoint.getLongitude());
        assertEquals(time, fieldPoint.getTimeOfSetting());
    }

}