package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {

    List<String> expected = Arrays.asList(
            "Budapest: 1489600",
            "Kukutyin: 53200",
            "Kiskunalsófelső: 2800"
    );

    Aid aid = new Aid(1_489_600);

    @Test
    void countAmountsOfAidWithTxt1Test(){
        List<String> amountsOfAid = aid.countAmountsOfAid(Paths.get("src/test/resources/population1.txt"));

        assertEquals(expected , amountsOfAid);

    }

    @Test
    void countAmountsOfAidWithNullPathTest(){
        Exception e = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(null));

        assertEquals("Counting problem occurred", e.getMessage());
        assertEquals(NullPointerException.class, e.getCause().getClass());
    }

    @Test
    void countAmountsOfAidWithWrongPathTest(){
        Exception e = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/aaaa.txt")));

        assertEquals("Counting problem occurred", e.getMessage());
        assertEquals(NoSuchFileException.class, e.getCause().getClass());
    }

    @Test
    void countAmountsOfAidText2Test(){
        Exception e = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population2.txt")));

        assertEquals("Counting problem occurred", e.getMessage());
        assertEquals(ArrayIndexOutOfBoundsException.class, e.getCause().getClass());
    }
    @Test
    void countAmountsOfAidText3Test(){
        Exception e = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population3.txt")));

        assertEquals("Counting problem occurred", e.getMessage());
        assertEquals(NumberFormatException.class, e.getCause().getClass());
    }

    @Test
    void countAmountsOfAidText4Test(){
        Exception e = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population4.txt")));

        assertEquals("Counting problem occurred", e.getMessage());
        assertEquals(ArithmeticException.class, e.getCause().getClass());
    }
}