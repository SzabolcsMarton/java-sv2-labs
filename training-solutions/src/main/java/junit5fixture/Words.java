package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }
    public void getWordsStartWith(String prefix){
        List<String> toDelete = new ArrayList<>();
        for (int i = 0; i < words.size();i++){
            if (!words.get(i).startsWith(prefix)) {
               toDelete.add(words.get(i));
            }
        }
        words.removeAll(toDelete);
    }

    public void getWordsWithLenght(int lenght){
        List<String> toDelete = new ArrayList<>();
        for (int i = 0; i < words.size();i++){
            if (words.get(i).length() != lenght) {
                toDelete.add(words.get(i));
            }
        }
        words.removeAll(toDelete);
    }

}
