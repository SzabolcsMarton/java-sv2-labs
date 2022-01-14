package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> flowers = new LinkedList<>();

    public void addFlower(String flower){
        flowers.add(flower);
    }

    public List<String> getFlowers() {
        return flowers;
    }

    public void  addFlowerInTheMiddle(String flower){
        int numberOfFLowers = flowers.size();
        int halfIndex = numberOfFLowers / 2;
        if(numberOfFLowers % 2 == 0){
            flowers.add(halfIndex,flower);
        } else {
            flowers.add(halfIndex,flower);
            flowers.add(halfIndex + 2,flower);
        }

    }

}
