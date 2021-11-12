package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = new ArrayList(Arrays.asList("Sanyi", "Bela", "Zsusza", null,"Eszter"));

    public String getWinner(){
        Random random = new Random();
        int winerIndex = random.nextInt(names.size() - 1);
        return names.get(winerIndex);
    }
}
