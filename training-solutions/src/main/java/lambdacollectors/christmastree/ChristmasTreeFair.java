package lambdacollectors.christmastree;

import java.util.*;
import java.util.stream.Collectors;

public class ChristmasTreeFair {

    private List<ChristmasTree> xmasTrees;

    public ChristmasTreeFair(List<ChristmasTree> xmasTrees) {
        this.xmasTrees = xmasTrees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        return xmasTrees
                .stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType,
                        Collectors.counting()));
    }

    public double getMaxHeightByType(PineTreeType type) {
        Optional<ChristmasTree> xmassTree =xmasTrees
                .stream()
                .filter(christmasTree -> christmasTree.getType().equals(type))
                .collect(Collectors.maxBy(Comparator.comparing(ChristmasTree::getHeight)));
        if(xmassTree.isEmpty()){
            return 0.0;
        }

        return xmassTree.get().getHeight();
    }

    public double getAveragePrice() {
        return xmasTrees
                .stream()
                .collect(Collectors.averagingDouble(ChristmasTree -> ChristmasTree.getType().getPricePerMeter()));
    }


//    : visszaadja az összes kapható fa árából számolt átlagos árat.
//    Ha üres a lista, 0.0-t adjon vissza!

    public List<ChristmasTree> getXmasTrees() {
        return new ArrayList<>(xmasTrees);
    }
}
