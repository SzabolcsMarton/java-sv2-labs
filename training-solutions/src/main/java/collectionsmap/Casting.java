package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        int nextNumber = Integer.MAX_VALUE;
        for (Integer actual : applicants.keySet()){
            if(actual > lastNumber && actual<nextNumber){
                nextNumber = actual;
            }
        }

        return applicants.get(nextNumber);
    }
}
