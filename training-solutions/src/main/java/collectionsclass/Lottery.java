package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        validateLotteryNumbers(lotteryType, ballCount);
        List<Integer> numbers = fillUpWithNumbers(ballCount);
        Collections.shuffle(numbers);
        List<Integer> winnerNumbers = numbers.subList(0,lotteryType);
        Collections.sort(winnerNumbers);
        return winnerNumbers;


    }

    private void validateLotteryNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Number of balls must be over the lotteryType");
        }
    }

    private List<Integer> fillUpWithNumbers(int maxNumber) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
            result.add(i);
        }
        return result;
    }
}
