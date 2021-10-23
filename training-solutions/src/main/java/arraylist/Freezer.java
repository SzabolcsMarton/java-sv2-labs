package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> inFridge = new ArrayList<>();
        inFridge.add("Borso");
        inFridge.add("Sertes hus");
        inFridge.add("Marha hus");
        inFridge.add("Jegkocka");
        inFridge.add("Fagyi");

        System.out.println(inFridge);
        System.out.println(inFridge.size());

        inFridge.remove("Marha hus");
        inFridge.remove("Sertes hus");

        System.out.println(inFridge);
        System.out.println(inFridge.size());

    }
}
