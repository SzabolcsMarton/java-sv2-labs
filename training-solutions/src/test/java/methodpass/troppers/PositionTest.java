package methodpass.troppers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void distanceFromTest(){
        Position p1 = new Position(5,6);
        Position p2 = new Position(6,6);

        assertEquals(1,p1.distanceFrom(p2),0.000001);
    }

}