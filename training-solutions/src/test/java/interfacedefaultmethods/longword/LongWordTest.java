package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void longWordTest() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/longword.txt"));

        assertEquals("LONGWORD", longWord.getLongWord());
    }

    @Test
    void longWordFileIsNotExistingTest() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/x.txt"));
        Exception ex = assertThrows(IllegalStateException.class,
                () -> longWord.getLongWord());
        assertEquals("Can`t read file", ex.getMessage());
    }
}