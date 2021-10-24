package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> peoples = new ArrayList<>();
        peoples.add("Kati");
        peoples.add("Jozsi");
        peoples.add("Tibi");
        peoples.add("Sanyi");
        peoples.add("Laci");
        peoples.add("Erzsi");
        peoples.add("Judit");
        peoples.add("Tomi");
        peoples.add("Vali");
        peoples.add("Pisti");
        Random random = new Random();
        int random1 = random.nextInt(5);
        int random2 = random.nextInt(5) + 5;

        System.out.println(peoples.get(random1));
        System.out.println(peoples.get(random2));
    }
}
