package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPikeNotIncludeTest() {
        int[] hightsOfPikes = new int[]{1000, 2000, 3000, 4000};

        assertEquals(false, new Mountain(hightsOfPikes).searchPike(new Pike("a", 2500)));
    }

    @Test
    void searchPikeTest() {
        int[] hightsOfPikes = new int[]{1000, 2000, 3000, 4000};

        assertEquals(true, new Mountain(hightsOfPikes).searchPike(new Pike("b",2000 )));
    }

}