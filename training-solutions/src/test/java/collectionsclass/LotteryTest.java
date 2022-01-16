package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void selectWinningNumbersWrongParamsTest() {
        int lotteryType = 5;
        int ballCount = 5;

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Lottery().selectWinningNumbers(lotteryType, ballCount));
        assertEquals("Number of balls must be over the lotteryType", ex.getMessage());
    }

    @Test
    void selectWinningNumbers() {
        List<Integer> winningNumbers = new Lottery().selectWinningNumbers(6, 45);

        assertEquals(6, winningNumbers.size());
    }
}