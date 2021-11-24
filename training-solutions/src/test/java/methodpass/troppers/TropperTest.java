package methodpass.troppers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TropperTest {

    @Test
    void createTropperTest(){
        Tropper tropper = new Tropper("G I Joe");

        assertEquals("G I Joe", tropper.getName());
        assertEquals(0, tropper.getPosition().getPosX());
    }

    @Test
    void createTropperWithNoName(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> new Tropper(""));
        assertEquals("You have to give the Name",iae.getMessage());
    }

    @Test
    void changePositionTest(){
        Tropper tropper = new Tropper("G I Joe");
        tropper.changePosition(new Position(5,6));

        assertEquals(5,tropper.getPosition().getPosX());
        assertEquals(6,tropper.getPosition().getPosY());
    }

    @Test
    void distanceFromTest(){
        Tropper tropper = new Tropper("G I Joe");
        tropper.changePosition(new Position(5,6));

        assertEquals(1,tropper.distanceFrom(new Position(6,6)));
    }

}