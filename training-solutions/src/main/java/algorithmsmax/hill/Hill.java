package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hillTops) {
        int top = Integer.MIN_VALUE;
        for (int actual : hillTops) {
            if (actual > top) {
                top = actual;
            }
        }
        return top;
    }
}
