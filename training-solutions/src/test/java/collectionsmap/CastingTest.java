package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    @Test
    void callNextApplicantTest() {
        Map<Integer, String> applicants = new HashMap<>();
        applicants.put(1, "a");
        applicants.put(6, "b");
        applicants.put(14, "c");


        assertEquals("a", new Casting().callNextApplicant(0, applicants));
        assertEquals("c", new Casting().callNextApplicant(8, applicants));
    }
}