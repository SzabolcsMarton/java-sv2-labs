package collectionsset;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuestionGame {

    private final List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Random random = new Random();
        Set<String> winners = new HashSet<>();
        while (winners.size() < 5){
            if(rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Run out of right answers");
            }
            int randomWinnerIndex = random.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(randomWinnerIndex).getName());
            rightAnswers.remove(randomWinnerIndex);

        }
        return winners;
    }

}
