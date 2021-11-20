package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String wordToCheck){
        for(String actual : words){
            if(actual.length() > wordToCheck.length()){
                return true;
            }
        }
        return false;
    }
}
