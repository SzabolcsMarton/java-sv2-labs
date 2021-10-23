package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("konyv", "kapa", "aso");
        System.out.println(importantThings);
        importantThings.set(0, "nagyharang");
        System.out.println(importantThings);
    }
}
