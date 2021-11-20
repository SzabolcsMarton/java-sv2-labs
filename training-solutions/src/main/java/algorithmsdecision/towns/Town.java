package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> cities, int max){
        for (int actual : cities){
            if(actual < max){
                return true;
            }
        }
        return false;
    }

}
