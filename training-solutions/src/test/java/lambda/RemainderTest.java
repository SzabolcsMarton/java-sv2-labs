package lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void changeNumbersToRemaindersTest(){
        List<Integer> numbers = Arrays.asList(45, 13, 64, 51, 92, 33);
        List<Integer> expected = Arrays.asList(0, 1, 1, 0, 2, 0);

        Remainder remainder = new Remainder();

        assertEquals(expected, remainder.changeNumbersToRemainders(numbers, 3));
    }

}