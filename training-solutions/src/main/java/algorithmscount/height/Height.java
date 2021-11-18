package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int heightLimit) {
        int counter = 0;
        for (int actual : heights) {
            if (actual >= heightLimit) {
                counter++;
            }
        }
        return counter;
    }
}
