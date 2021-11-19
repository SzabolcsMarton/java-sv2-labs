package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> degrees){
        int min = Integer.MAX_VALUE;
        for (int actual : degrees){
            if(actual < min){
                min = actual;
            }
        }
        return min;
    }

}
