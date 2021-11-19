package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer oldestTrainer = null;
        for (Trainer actual : trainers){
            if (oldestTrainer == null || actual.getAge() > oldestTrainer.getAge()) {
                oldestTrainer = actual;
            }
        }
        return oldestTrainer;
    }
}
