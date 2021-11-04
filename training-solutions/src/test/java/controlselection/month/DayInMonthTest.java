package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void testDayInMonth(){
        assertEquals(30,new DayInMonth().daysInMonth(2021,"szeptember"));
        assertEquals(31,new DayInMonth().daysInMonth(2021,"október"));
        assertEquals(28, new DayInMonth().daysInMonth(2021,"február"));
        //leapyear
        assertEquals(29,new DayInMonth().daysInMonth(2020,"február"));
    }
    @Test
    void testCaseSensitivity(){
        assertEquals(30,new DayInMonth().daysInMonth(2021,"SZEPTEMBER"));
        assertEquals(31,new DayInMonth().daysInMonth(2021,"okTÓber"));
    }

    @Test
    void testIllegal(){
        assertEquals(0,new DayInMonth().daysInMonth(2021, "kedd"));
    }


}