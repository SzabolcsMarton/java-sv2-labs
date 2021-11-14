package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    private void readAndWriteNames() {
        List<String> paulStreetBoys = new ArrayList<>();
        try {
            paulStreetBoys = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file.", ioe);
        }
        writeNames(paulStreetBoys);
    }

    public void writeNames(List<String> names){
        for (String name: names){
            if(name.equals("Nemecsek Ernő")){
                System.out.println(name.toLowerCase());
            }else {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        paulStreetBoys.readAndWriteNames();
    }


}
