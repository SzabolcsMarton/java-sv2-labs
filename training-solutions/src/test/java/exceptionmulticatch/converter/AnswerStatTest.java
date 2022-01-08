package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    @Test
    void convertNullTest() {
        AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());

        Exception e = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert(null));
        assertEquals("String To Convert is null", e.getCause().getMessage());
    }

    @Test
    void convertInvalidStringTest() {
        AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());

        Exception ex = assertThrows(InvalidBinaryStringException.class,
                () -> answerStat.convert("10121"));
        assertEquals("String To Convert is not valid format", ex.getCause().getMessage());
    }

    @Test
    void convertTest() {
        BinaryStringConverter binaryStringConverter = new BinaryStringConverter();
        AnswerStat answerStat = new AnswerStat(binaryStringConverter);

        assertArrayEquals(binaryStringConverter.binaryStringToBooleanArray("10010110"), answerStat.convert("10010110"));
    }

    @Test
    void answerTruePercentTest() {
        BinaryStringConverter binaryStringConverter = new BinaryStringConverter();
        AnswerStat answerStat = new AnswerStat(binaryStringConverter);

        assertEquals(60, answerStat.answerTruePercent("11001"));
        assertEquals(20, answerStat.answerTruePercent("00100"));
    }

}