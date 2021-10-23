package arrays;

import java.util.Arrays;

public class ArraysMain {
//    public  String numberOfDaysAsString() {
//        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        return Arrays.toString(numberOfDays);
//    }

    public  String multiplicationTableAsString(int size) {
        int[][] multiplicTable = new int[size][size];
        for ( int i = 0; i < multiplicTable.length; i++) {
            for (int j = 0; j < multiplicTable.length; j++){
                multiplicTable[i][j] = ( i + 1 ) * ( j + 1);
            }
        }
        return Arrays.deepToString(multiplicTable);
    }




    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.multiplicationTableAsString(5));
    }
}
