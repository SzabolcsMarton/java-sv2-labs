package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> studentsNames = new ArrayList<>(Arrays.asList("Kiss Jozsef", "Toth Erzsike", "Ka Pal",
            "Han Solo", "Kovacs Lany"));

    public String getTodayReferringStudent(int number){
        return studentsNames.get(number - 1);
    }

    public String getTodayReferringStudent(Number number){
        return studentsNames.get(number.getValue() - 10);
    }

    public String getTodayReferringStudent(String numberName){
        return studentsNames.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }




}
