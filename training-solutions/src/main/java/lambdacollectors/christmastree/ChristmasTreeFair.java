package lambdacollectors.christmastree;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTreeFair {

    private List<ChristmasTree> xmasTrees;

    public ChristmasTreeFair(List<ChristmasTree> xmasTrees) {
        this.xmasTrees = xmasTrees;
    }

    public List<ChristmasTree> getXmasTrees() {
        return new ArrayList<>(xmasTrees);
    }
}
