package introexceptionmoreexceptions;

import java.util.Arrays;

public class ThreeArrays {
    public static void main(String[] args) {
        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 2, 1, 42};
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }
}
//igazábol le se kell futtatni, ArrayIndexOutOfBoundsException -t dob mivel a third tömböt
// a first hosszára állitottuk be igy az egyel hosszabb lesz tehát a legutolso iterációban mikor a third[i]-t állitaná be
// a first[i] / second[i]-re azok az indexek mar nem is lesznek.