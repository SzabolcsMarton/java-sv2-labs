package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String stringToValidate){
        if(stringToValidate == null || stringToValidate.length() == 0 || stringToValidate.isBlank()){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List<Object> listToValidate){
        if(listToValidate == null || listToValidate.isEmpty()){
            return true;
        }
        return false;
    }
}
