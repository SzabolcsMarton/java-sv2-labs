package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String stringToValidate){
        return stringToValidate == null || stringToValidate.length() == 0 || stringToValidate.isBlank();
    }

    public static boolean isEmpty(List<String> listToValidate){
        return listToValidate == null || listToValidate.isEmpty();
    }
}
