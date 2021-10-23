package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("kulcs");
        wordsList.add("kalyha");
        wordsList.add("lo");
        wordsList.add("ajto");
        wordsList.add("cseresznyefa");
        wordsList.add("tej");
        wordsList.add("felho");
        wordsList.add("cipo");
        wordsList.add("mosoda");
        wordsList.add("kavetejszin");
        wordsList.add("citera");
        wordsList.add("baba");


        for(String str: wordsList){
            if (str.length() == 6) {
                System.out.print(str + ", ");
            }
        }
    }
}
