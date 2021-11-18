package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest(){
        Height height = new Height();
        List<Integer> heights = Arrays.asList(125, 132 ,145, 117, 125, 138, 150, 154);

        assertEquals(4, height.countChildrenWithHeightGreaterThan(heights,135));
    }

}