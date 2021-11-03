package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testName(){
        Dragon dragon = new Dragon("Susu",1,15.0);

        assertEquals("Susu",dragon.getName());
        assertNotEquals("Geza", dragon.getName());

    }
    @Test
    void testNumberOfHead(){
        Dragon dragon = new Dragon("Susu",1,15.0);

        assertEquals(1,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() ==5);
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Susu",1,15.0);

        assertEquals(15.0,dragon.getHeight(),0.005);
    }

    @Test
    void testNull(){
        Dragon dragon = new Dragon("Susu",1,15.0);
        Dragon otherDragon = new Dragon(null,1,15.0);

        assertNotNull(dragon.getName());
        assertNull(otherDragon.getName());
    }

    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Susu",1,15.0);
        Dragon otherDragon = dragon;

        assertSame(dragon, otherDragon);

    }

    @Test
    void testNotSameObject(){
        Dragon dragon = new Dragon("Susu",1,15.0);
        Dragon otherDragon = new Dragon("Susu",1,15.0);

        assertNotSame(dragon,otherDragon);
    }

}