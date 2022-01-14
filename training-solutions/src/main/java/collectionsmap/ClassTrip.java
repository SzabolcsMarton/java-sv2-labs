package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inPayments = new HashMap<>();

    public Map<String, Integer> getInPayments() {
        return inPayments;
    }

    public void loadInpayments(Path path){
        try {
            List<String> linesFromFile = Files.readAllLines(path);
            loadToMap(linesFromFile);
        }catch (IOException ioe){
            throw new IllegalArgumentException("Can not read file", ioe);
        }

    }

    private void loadToMap(List<String > linesFromFile){
        for (String actual : linesFromFile){
            inPayments.put(actual.split(":")[0],Integer.parseInt(actual.split(":")[1]));
        }
    }
}
