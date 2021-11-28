package constructoroverloading.bus;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    @Test
    void createBusTimeTableWithListTest() {
        List<SimpleTime> timeTable = Arrays.asList(
                new SimpleTime(8, 40),
                new SimpleTime(9, 30),
                new SimpleTime(11, 20));
        BusTimeTable busTimeTable = new BusTimeTable(timeTable);

        assertEquals(9, busTimeTable.getTimeTable().get(1).getHours());
        assertEquals(20, busTimeTable.getTimeTable().get(2).getMinutes());
        assertEquals(3, busTimeTable.getTimeTable().size());
    }

    @Test
    void createBusTimeTableWithIntTest() {
        BusTimeTable busTimeTable = new BusTimeTable(8, 12, 22);

        assertEquals(10, busTimeTable.getTimeTable().get(2).getHours());
        assertEquals(4, busTimeTable.getTimeTable().size());
    }

    @Test
    void nextBusTest() {
        BusTimeTable busTimeTable = new BusTimeTable(8, 12, 22);

        assertEquals("10 : 22", busTimeTable.getNextBus(new SimpleTime(9, 55)).toString());
    }

    @Test
    void nextBusWithException() {
        BusTimeTable busTimeTable = new BusTimeTable(8, 12, 22);

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> busTimeTable.getNextBus(new SimpleTime(15, 12)));
        assertEquals("No more bus!", exception.getMessage());

    }


}