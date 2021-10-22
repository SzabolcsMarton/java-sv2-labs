package arrayofarrays;

public class DailyValues {
    public void getValues() {
        int[][] valueArray = new int[12][];
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0; i < valueArray.length; i++) {
            valueArray[i] = new int[daysOfMonth[i]];
        }
        ArrayOfArrays arrayOfArrays =new ArrayOfArrays();
        arrayOfArrays.printArrayOfArrays(valueArray);
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();

    }

}
