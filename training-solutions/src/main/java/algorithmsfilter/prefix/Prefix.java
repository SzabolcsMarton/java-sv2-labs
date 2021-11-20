package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> fillteredList = new ArrayList<>();
        for (String actual : words){
            if(actual.startsWith(prefix)){
                fillteredList.add(actual);
            }
        }
        return fillteredList;
    }
}
