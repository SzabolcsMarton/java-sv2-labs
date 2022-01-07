package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    @Test
    void binaryStringToBooleanArrayInvalidStringTest() {
        String binaryString = "011001200100";
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> converter.binaryStringToBooleanArray(binaryString));
        assertEquals("String To Convert is not valid format", ex.getMessage());
    }

    @Test
    void binaryStringToBooleanArrayNulStringTest() {
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(NullPointerException.class, () -> converter.binaryStringToBooleanArray(null));
        assertEquals("String To Convert is null", ex.getMessage());
    }

    @Test
    void binaryStringToBooleanTest() {
        String binaryString = "001010111";
        BinaryStringConverter converter = new BinaryStringConverter();
        boolean[] expected = new boolean[]{false, false, true, false, true, false, true, true, true};

        assertArrayEquals(expected, converter.binaryStringToBooleanArray(binaryString));
    }

    @Test
    void booleanArrayToBinaryStringWithEmptyArrayTest() {
        boolean[] booleans = new boolean[0];
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> converter.booleanArrayToBinaryString(booleans));
        assertEquals("BooleansArray to convert is empty", ex.getMessage());
    }

    @Test
    void booleanArrayToBinaryStringWithNullTest() {
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(NullPointerException.class, () -> converter.booleanArrayToBinaryString(null));
        assertEquals("BooleansArray to convert is null", ex.getMessage());
    }
    @Test
    void testBooleanArrayToBinaryStringShouldConvert() {
        boolean[] booleans = new boolean[]{false, true, true, false, false};
        BinaryStringConverter converter = new BinaryStringConverter();
        String expected = "01100";

        assertEquals(expected, converter.booleanArrayToBinaryString(booleans));
    }

}