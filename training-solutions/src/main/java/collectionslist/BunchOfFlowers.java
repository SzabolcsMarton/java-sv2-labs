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
        int halfIndex = flowers.size() / 2;
        if(halfIndex % 2 == 0){
            flowers.add(flower);
        } else {
            flowers.add(halfIndex,flower);
            flowers.add(halfIndex + 2,flower);
        }

    }

}
