package arrays;

import java.util.Arrays;

public class ArraysMain {
    public  String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public  String multiplicationTableAsString(int size) {
        int[][] multiplicTable = new int[size][size];
        for ( int i = 0; i < multiplicTable.length; i++) {
            for (int j = 0; j < multiplicTable.length; j++){
                multiplicTable[i][j] = ( i + 1 ) * ( j + 1);
            }
        }
        return Arrays.deepToString(multiplicTable);
    }

    public boolean sameTempValues(double[] day, double[] otherDay) {
        return Arrays.equals(day,otherDay);
    }

    public int min(int a, int b){
        return a > b ? b : a;
    }

    public boolean sameTempValuesDaylight(double[] day, double[] otherday) {
        int hoursToCheck = min(day.length, otherday.length);
        double[] rangeDay = Arrays.copyOfRange(day,0, hoursToCheck);
        double[] rangeOtherday = Arrays.copyOfRange(otherday,0, hoursToCheck);
        return Arrays.equals(rangeDay, otherday);
    }

    public boolean wonLottery(int[] fortune, int[] player) {
//        Arrays.sort(fortune);
//        Arrays.sort(player);
//        return Arrays.equals(fortune, player);

          int[] arrayFortune = Arrays.copyOfRange(fortune, 0, fortune.length);
          int[] arrayPlayers = Arrays.copyOfRange(player, 0, player.length);
          Arrays.sort(arrayFortune);
          Arrays.sort(arrayPlayers);
          return  Arrays.equals(arrayFortune,arrayPlayers);



    }

    public static void main(String[] args) {
        double[] temps1 = {10.2, 10.8, 14.5, 15.6, 16.0, 17.5, 18.5, 19.0, 20.2, 22.0, 21.4, 20.8, 21.3, 20.1, 19.5, 18.4, 17.6, 16.5, 15.4, 15.0, 14.7, 13.5, 12.4, 11.8};
        double[] temps2 = {10.2, 10.8, 12.5, 15.3, 15.0, 17.1, 18.5, 19.0, 20.2, 21.0, 20.4, 20.9, 21.0, 20.1, 18.5, 18.4, 16.1, 16.5, 16.4, 15.0, 14.7, 13.5, 12.4, 11.8};
        double[] controlArrayTemp1 = {10.2, 10.8, 14.5, 15.6, 16.0, 17.5, 18.5, 19.0, 20.2, 22.0, 21.4, 20.8, 21.3, 20.1, 19.5, 18.4, 17.6, 16.5, 15.4, 15.0, 14.7, 13.5, 12.4, 11.8};
        double[] temp23fortest = {10.2, 10.8, 14.5, 15.6, 16.0, 17.5, 18.5, 19.0, 20.2, 22.0, 21.4, 20.8, 21.3, 20.1, 19.5, 18.4, 17.6, 16.5, 15.4, 15.0, 14.7, 13.5, 12.4};
        int[] winnerArray = {11, 43, 5, 56, 32};
        int[] playerArray = {15, 56, 78, 64, 3};

        System.out.println("winnerArray: " + Arrays.toString(winnerArray));
        System.out.println("playerArray: " + Arrays.toString(playerArray));

        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println();
        System.out.println(arraysMain.multiplicationTableAsString(6));
        System.out.println();
        System.out.println(arraysMain.sameTempValues(temps1,temps2));
        System.out.println(arraysMain.sameTempValues(temps1,controlArrayTemp1));
        System.out.println();
        System.out.println(arraysMain.sameTempValuesDaylight(temps1, temps2));
        System.out.println(arraysMain.sameTempValuesDaylight(temps1,temp23fortest));
        System.out.println();
        System.out.println(arraysMain.wonLottery(winnerArray,playerArray));
        System.out.println();
        System.out.println(Arrays.toString(winnerArray));
        System.out.println(Arrays.toString(playerArray));


    }
}
