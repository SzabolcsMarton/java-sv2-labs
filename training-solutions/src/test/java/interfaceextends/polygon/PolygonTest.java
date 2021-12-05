package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void createTest() {
        Polygon polygon = new Polygon(5, 7);

        assertEquals(5, polygon.getLengthOfSide());
        assertEquals(7, polygon.getNumberOfVertices());
    }

    @Test
    void geometricTest() {
        Polygon polygon = new Polygon(5, 7);

        assertEquals(35, polygon.getPerimeter());
        assertEquals(4, polygon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(14, polygon.getNumberOfAllDiagonals());
    }
}