package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void addFlowerTest() {
        BunchOfFlowers bunch = new BunchOfFlowers();
        assertEquals(0, bunch.getFlowers().size());
        bunch.addFlower("Virag");

        assertEquals(1, bunch.getFlowers().size());
        assertEquals("Virag",bunch.getFlowers().get(0));
    }



    @Test
    void addFlowerInTheMiddleWithEvenBunchTest() {
        BunchOfFlowers bunch = new BunchOfFlowers();
        bunch.addFlower("aaa");
        bunch.addFlower("bbb");
        bunch.addFlower("ccc");
        bunch.addFlower("ddd");

        bunch.addFlowerInTheMiddle("Virag");
        assertEquals(5,bunch.getFlowers().size());
        assertEquals("Virag",bunch.getFlowers().get(2));
    }

    @Test
    void addFlowerInTheMiddleWithOddBunchTest(){
        BunchOfFlowers bunch = new BunchOfFlowers();
        bunch.addFlower("aaa");
        bunch.addFlower("bbb");
        bunch.addFlower("ccc");
        bunch.addFlower("ddd");
        bunch.addFlower("eee");
        bunch.addFlowerInTheMiddle("Virag");

        assertEquals(7,bunch.getFlowers().size());
        assertEquals("Virag",bunch.getFlowers().get(2));
        assertEquals("Virag", bunch.getFlowers().get(4));
    }
}