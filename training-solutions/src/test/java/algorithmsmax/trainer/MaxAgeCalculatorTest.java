package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {
    MaxAgeCalculator maxAgeCalc = new MaxAgeCalculator();
    List<Trainer> trainers = new ArrayList<>();


    @Test
    void getTrainerWithMaxAgeTest(){
        trainers.add(new Trainer("a",20));
        trainers.add(new Trainer("b",25));
        trainers.add(new Trainer("c",27));
        trainers.add(new Trainer("d",29));

        Trainer oldestOne = maxAgeCalc.getTrainerWithMaxAge(trainers);
        assertSame(trainers.get(3),oldestOne);

    }

}