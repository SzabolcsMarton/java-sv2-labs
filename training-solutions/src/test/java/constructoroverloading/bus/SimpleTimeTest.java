package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void createSimpleTimewithOneParamTest(){
        SimpleTime simpleTime = new SimpleTime(11);

        assertEquals(0, simpleTime.getMinutes());
        assertEquals(11, simpleTime.getHours());
    }

    @Test
    void createSimpleTimewithTwoParamTest(){
        SimpleTime simpleTime = new SimpleTime(11,11);

        assertEquals(11, simpleTime.getMinutes());
        assertEquals(11, simpleTime.getHours());
    }

    @Test
    void createSimpleTimeWithSimpleTimeTest(){
        SimpleTime simpleTime = new SimpleTime(new SimpleTime(12,12));

        assertEquals(12, simpleTime.getMinutes());
        assertEquals(12, simpleTime.getHours());
    }

    @Test
    void getDifferenceTest(){
        SimpleTime simpleTime = new SimpleTime(10,10);
        SimpleTime otherSimpleTime = new SimpleTime(11,20);

        assertEquals(-70,simpleTime.getDifference(otherSimpleTime));
    }

    @Test
    void toStringTest(){
        SimpleTime simpleTime = new SimpleTime(10,20);

        assertEquals("10 : 20", simpleTime.toString());
    }

}