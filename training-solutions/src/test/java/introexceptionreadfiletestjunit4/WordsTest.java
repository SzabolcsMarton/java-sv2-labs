package introexceptionreadfiletestjunit4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    private Words words = new Words();

    @Test
    public void testGetFirstWordWithA(){
        Path path = Paths.get("src/test/resources/words.txt");

        assertEquals("Anna", words.getFirstWordWithA(path));
    }

    @Test
    public void testGetFirstWordWithAWithA(){
        Path path = Paths.get("src/test/resources/words_.txt");

        assertEquals("A", words.getFirstWordWithA(path));
    }

    @Test
    public void testGetFirstWordWithAWithWrongPath(){
        Path path = Paths.get("src/test/resources/wor_ds_.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Olvasasi hiba!", exception.getMessage());
    }
}