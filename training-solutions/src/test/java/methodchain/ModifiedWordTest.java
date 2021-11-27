package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modifyTest() {
        ModifiedWord modifiedWord = new ModifiedWord();
        String test = modifiedWord.modify("kalapacs");

        assertEquals("KxLy", test);
    }
}