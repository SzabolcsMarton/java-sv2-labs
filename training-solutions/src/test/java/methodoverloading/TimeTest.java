package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    Time time = new Time(11,12,13);
    Time testTimeSame = new Time(11,12,13);
    Time testTimeOther = new Time(22,22,22);

    @Test
    void createTimeTest(){
        assertEquals(11,time.getHours());
        assertEquals(12,time.getMinutes());
        assertEquals(13,time.getSeconds());

    }

    @Test
    void isEqualWithTimeTest() {
       assertTrue(time.isEqual(testTimeSame));
       assertFalse(time.isEqual(testTimeOther));

    }

    @Test
    void IsEquaWithIntTest() {
        assertTrue(time.isEqual(testTimeSame));
        assertFalse(time.isEqual(testTimeOther));
    }

    @Test
    void isEarlierWithTimeTest() {
        assertTrue(time.isEqual(testTimeSame));
        assertFalse(time.isEqual(testTimeOther));
    }

    @Test
    void IsEarlierWithIntTest() {
        assertTrue(time.isEqual(testTimeSame));
        assertFalse(time.isEqual(testTimeOther));
    }
}