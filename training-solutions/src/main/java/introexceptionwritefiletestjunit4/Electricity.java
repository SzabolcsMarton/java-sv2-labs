package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public List<String> createListOfStreets(){
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Alma utca");
        streets.add("Fo utca");
        streets.add("Utca utca");
        streets.add("Ilyen utca");
        streets.add("Olyan utca");

        return streets;
    }

    public void writeStreets(Path path){
        List<String> streets = createListOfStreets();
        try {
            Files.write(path, streets);
        }catch (IOException ioe){
            throw new IllegalStateException("Hiba iras kozben!", ioe);
        }
    }
}
