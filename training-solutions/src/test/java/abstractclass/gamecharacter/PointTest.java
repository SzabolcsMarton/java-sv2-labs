package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void creationTest() {
        Point point = new Point(10, 15);

        assertEquals(10L, point.getX());
        assertEquals(15L, point.getY());
    }

    @Test
    void getDistanceTest() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(100, 100);

        assertEquals(141L, point1.distance(point2));
    }
}