package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship;
    Ship otherShip;
    Ship thirdShip;
    Ship fourthShip;

    @BeforeEach
    void initShip(){

        ship = new Ship("Titanic", 1911, 269.0);
        otherShip = new Ship(null,1911,269.0);
        thirdShip = ship;
        fourthShip = new Ship("Titanic", 1911, 269);

    }


    @Test
    void testName(){
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Britannia", ship.getName());
    }

    @Test
    void  testYearOfConstruction(){
        assertEquals(1911,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1911);
        assertFalse(ship.getYearOfConstruction() == 1920);
    }

    @Test
    void testLenght(){
        assertEquals(269.0,ship.getLenght(),0.005);
    }

    @Test
    void testNull(){
        assertNotNull(ship.getName());
        assertNull(otherShip.getName());
    }
    @Test
    void testSameObject(){
        assertSame(ship,thirdShip);
    }

    @Test
    void testNotSameObject(){
        assertNotSame(ship,fourthShip);
    }


}