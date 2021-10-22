package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source){
        for( int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + " " + source[i];
        }
    }

    public static void main(String[] args) {
        int [] sourceIntArray = new int []{1, 2, 3, 4, 5};
        String [] sourceStringArray = new String[]{"Hetfő", "Kedd", "Szerda", "Csütörtök", "Péntek"};
        ArrayHandler arrayHandler = new ArrayHandler();

//        arrayHandler.addIndexToNumber(sourceIntArray);
//        for (int item: sourceIntArray) {
//            System.out.println(item);
//        }
//        for (int  item: sourceIntArray) {
//            System.out.print(item + ", ");
//        }

        arrayHandler.concatenateIndexToWord(sourceStringArray);
        for (String item: sourceStringArray) {
            System.out.println(item);
        }
        for (String  item: sourceStringArray) {
            System.out.print(item + ", ");
        }
    }

}
