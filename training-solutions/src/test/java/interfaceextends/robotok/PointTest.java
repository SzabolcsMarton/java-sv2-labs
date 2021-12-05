package interfaceextends.robotok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void createPointTest(){
        Point point = new Point(10,20,30);

        assertEquals(10, point.getX());
        assertEquals(20,point.getY());
        assertEquals(30,point.getZ());
    }

}