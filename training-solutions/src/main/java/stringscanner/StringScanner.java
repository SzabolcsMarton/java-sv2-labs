package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Irjon be egy tobb tagbol allo mondatot:");
        String sentence = scnr.nextLine();
        Scanner scnrByWords = new Scanner(sentence);
        while (scnrByWords.hasNext()){
            System.out.println(scnrByWords.next());
        }
        System.out.println();
        System.out.println("Irjon be egy tobb reszbol allo mondatot, ismet!:");
        String otherSentence = scnr.nextLine();
        Scanner scnrForParts = new Scanner(otherSentence).useDelimiter(",");
        while ((scnrForParts.hasNext())){
            System.out.println(scnrForParts.next());
        }

    }

}
