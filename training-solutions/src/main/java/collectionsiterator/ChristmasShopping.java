package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeToExpensivePresent(int maxPrice){
        Iterator<ChristmasPresent> presentIterator = presents.iterator();
        while (presentIterator.hasNext()) {
            int actualPrice = presentIterator.next().getPrice();
            if(maxPrice < actualPrice){
                presentIterator.remove();
            }
        }
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }
}
