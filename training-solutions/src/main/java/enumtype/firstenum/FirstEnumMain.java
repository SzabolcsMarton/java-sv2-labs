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

        System.out.println();

        System.out.println(Ocean.valueOf("ARCTIC"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));

        System.out.println();

        System.out.println(Football.BAL_HATSO.name());
        System.out.println(Football.BAL_VEDO.name());
        System.out.println(Football.JOBB_ELSO.name());
        System.out.println(Football.JOBB_HATSO.name());
        System.out.println(Football.TAMADO.name());
        System.out.println(Football.KAPUS.name());
    }
}
