package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 100) {
                sb.append(number);
                sb.append(", ");
            }
        }
        String finalString = sb.toString();
        if (finalString.length() == 0) {
            return finalString;
        }

        return finalString.substring(0, finalString.length() - 2);
    }


    public static void main(String[] args) {
        IntScanner scnr = new IntScanner();

        System.out.println(scnr.convertInts("5;3;107;12;123;18;198"));
        System.out.println(scnr.convertInts("107"));
        System.out.println(scnr.convertInts("5;2;3;7"));
        System.out.println(scnr.convertInts(""));
    }
}
