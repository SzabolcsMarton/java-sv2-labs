package array;

public class ArrayMain {

    public static void main(String[] args) {
//        String [] daysOfTheWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
//        System.out.println(daysOfTheWeek[1]);
//        System.out.println(daysOfTheWeek.length);

//        int[] powOfTwoo = new int[5];
//        powOfTwoo[0] = 1;
//        for (int i = 1; i < powOfTwoo.length; i++) {
//            powOfTwoo[i] = powOfTwoo[i - 1] * 2;
//        }
//
//        for (int j : powOfTwoo) {
//            System.out.print(j + ", ");
//        }

        boolean[] sixBooleans = new boolean[6];
        sixBooleans[0] = false;
        for (int i =1; i < sixBooleans.length; i++) {
            sixBooleans[i] = !sixBooleans[ i - 1 ];
        }
        for ( boolean j: sixBooleans) {
            System.out.print(j + ", ");
        }
    }
}
