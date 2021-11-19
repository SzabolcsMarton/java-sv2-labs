package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMinTest(){
        Temperature temp = new Temperature();
        List<Integer> testTempList = Arrays.asList(5, 7, 6, 9, 12, 10, 7, 3, 6, 2);

        assertEquals(2, temp.getMin(testTempList));

    }

}