package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

    @Test
    void testGetTableOfNumbers() {
        Labels labels = new Labels();

        int[][] table = labels.getTableOfNumbers(7);


        assertEquals(7, table[3][2]);
        assertEquals(12, table[5][5]);
    }
}
