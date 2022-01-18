package lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaplingTest {

    @Test
    void cutWithLowerMaxShouldSetNewHightTest() {
        Sapling sapling = new Sapling("Teak tree", 175);
        sapling.cut(160);

        assertEquals(160, sapling.getHeight());
    }

    @Test
    void cutWithHigherMaxShouldNotSetNewHightTest(){
        Sapling sapling = new Sapling("Teak tree", 175);
        sapling.cut(180);

        assertEquals(175, sapling.getHeight());
    }
}