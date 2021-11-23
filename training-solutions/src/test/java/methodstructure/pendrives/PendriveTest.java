package methodstructure.pendrives;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    @Test
    void createPendriveTest(){
        Pendrive pendrive = new Pendrive("Pendrive",64, 4000);

        assertEquals("Pendrive", pendrive.getName());
        assertEquals(64, pendrive.getCapacity());
        assertEquals(4000, pendrive.getPrice());
    }

    @Test
    void reisePriseTest(){
        Pendrive pendrive = new Pendrive("Pendrive",64, 4000);

        pendrive.risePrise(10);
        assertEquals(4400, pendrive.getPrice());
    }

    @Test
    void comparePricePerCapacityTest(){
        Pendrive pendrive = new Pendrive("Pendrive",64, 4000);
        Pendrive otherPendrive = new Pendrive("Pendrive2",64, 3000);

        assertEquals(1, pendrive.comparePricePerCapacity(otherPendrive));
        assertEquals(0, pendrive.comparePricePerCapacity(pendrive));
        assertEquals(-1, otherPendrive.comparePricePerCapacity(pendrive));
    }

    @Test
    void isCheapeThanTest(){
        Pendrive pendrive = new Pendrive("Pendrive",64, 4000);
        Pendrive otherPendrive = new Pendrive("Pendrive2",64, 3000);

        assertFalse(pendrive.isCheaperThan(otherPendrive));
        assertTrue(otherPendrive.isCheaperThan(pendrive));
    }

}