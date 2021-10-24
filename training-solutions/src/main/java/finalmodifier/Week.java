package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> DAYS_OF_THE_WEEK = Arrays.asList("Hétfo", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public static void main(String[] args) {
        System.out.println(DAYS_OF_THE_WEEK);
        DAYS_OF_THE_WEEK.set(1, "Szerda");;
        System.out.println(DAYS_OF_THE_WEEK);

    }


}
