package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readCoordinates() {
        List<String> coordinates = new ArrayList<>();
        try {
            coordinates = Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Olvasasi hiba, a file nem talalhato!",ioe);
        }
        return coordinates;
    }

    public List<Integer> getAltitudes(List<String> fullCoordinates) {
        List<Integer> altitudes = new ArrayList<>();
        for (String coordinate : fullCoordinates) {
            int altInInt = changeToInt(coordinate.split(";")[2]);
            altitudes.add(altInInt);
        }
        return altitudes;
    }

    public int changeToInt(String numberString) {
        return Integer.parseInt(numberString);
    }

    public void writeTheDistances(List<Integer> altitudes){
       for (int i = 0; i < altitudes.size() - 1; i++){
           System.out.println(altitudes.get(i + 1) - altitudes.get(i));
       }
    }
}
