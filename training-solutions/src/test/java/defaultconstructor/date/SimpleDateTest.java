package defaultconstructor.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    @Test
    void createSimpleDateTest(){
        SimpleDate simpleDate = new SimpleDate();

        assertEquals(0,simpleDate.getDay());
    }

    @Test
    void setDateTest(){
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2021,11,28);

        assertEquals(2021, simpleDate.getYear());
        assertEquals(11, simpleDate.getMonth());
        assertEquals(28, simpleDate.getDay());
    }

    @Test
    void setDateWithWrongYearTest(){
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> simpleDate.setDate(1899,10,12));

        assertEquals("Incorrect data 1899, 10, 12",exception.getMessage());
    }

    @Test
    void setDateWithWrongMonthTest(){
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> simpleDate.setDate(2021,13,12));

        assertEquals("Incorrect data 2021, 13, 12",exception.getMessage());
    }

    @Test
    void setDateWithWrongDayFeb29NoLeapYearTest(){
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> simpleDate.setDate(2021,2,29));

        assertEquals("Incorrect data 2021, 2, 29",exception.getMessage());
    }

    @Test
    void setDateWithFeb29InLeapYearTest(){
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2020,2,29);

        assertEquals(29,simpleDate.getDay());
    }



}