package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMaxTest(){
        Hill hill = new Hill();
        List<Integer> hillTops = Arrays.asList(5489, 4852, 6547, 2546, 8420, 6745);

        assertEquals(8420, hill.getMax(hillTops));
    }

}