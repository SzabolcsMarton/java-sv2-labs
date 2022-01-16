package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> classPerKg = new HashMap<>();

    public void putFurtherPaper(String className, int kilogramms){
       if( kilogramms == 0)
           return;
       if(!classPerKg.containsKey(className)){
           classPerKg.put(className,kilogramms);
       }else {
           classPerKg.put(className, classPerKg.get(className) + kilogramms);
       }
    }

    public String getWinnerClass(){
        int highestKg = Integer.MIN_VALUE;
        String resultClass = "";

        for (String actualclass : classPerKg.keySet()){
            if(classPerKg.get(actualclass) > highestKg){
                highestKg = classPerKg.get(actualclass);
                resultClass = actualclass;
            }
        }

        return resultClass;
    }

    public int getTotalWeight(){
        int result = 0;
        for (Integer actual : classPerKg.values()){
            result += actual;
        }

        return result;
    }



    public Map<String, Integer> getClassPerKg() {
        return classPerKg;
    }
}
