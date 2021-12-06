package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void squareTest() {
        TableCloth tableCloth = new TableCloth(5);

        assertEquals(4, tableCloth.getNumberOfSides());
        assertEquals(7.07, tableCloth.getLengthOfDiagonal(), 0.005);
        assertEquals(20.0, tableCloth.getPerimeter(), 0.001);
        assertEquals(25.0, tableCloth.getArea(), 0.001);
    }
}