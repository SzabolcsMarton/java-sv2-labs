package lambdacollectors.honey;

import java.util.ArrayList;
import java.util.List;

public class BeeKeeper {

    private List<Honey> honeys;

    public BeeKeeper(List<Honey> honeys) {
        this.honeys = honeys;
    }

    public List<Honey> getHoneys() {
        return new ArrayList<>(honeys);
    }
}
