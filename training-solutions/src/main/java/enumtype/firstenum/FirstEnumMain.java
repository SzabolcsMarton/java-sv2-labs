package enumtype.firstenum;

import java.util.ArrayList;
import java.util.List;

public class FirstEnumMain {
    public static void main(String[] args) {
        List<Enum> enumList = new ArrayList<>();
        for(Continent cont: Continent.values()){
            System.out.println(cont);
            enumList.add(cont);
        }
        System.out.println(enumList);
    }
}
