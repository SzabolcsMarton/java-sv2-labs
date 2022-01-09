package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void getFullNameTest() {
        List<String> testResult = siblings.getFullNames("Kovacs", Paths.get("src/test/resources/siblingsnames.txt"));

        assertEquals(3, testResult.size());
        assertEquals("Kovacs Anita", testResult.get(1));
    }

    @Test
    void getFullNameTestWithWrongPath() {
        Path path = Paths.get("src/test/resources/nonames.txt");
        Exception exception = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Kovacs", path));
        assertEquals("Problem while reading file", exception.getMessage());
    }

}