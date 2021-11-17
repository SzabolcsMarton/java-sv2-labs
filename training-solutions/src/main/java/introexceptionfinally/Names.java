package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    private String findNameWithPrefix(String prefix, List<String> allNames) {
        for (String name : allNames) {
            if (name.startsWith(prefix)) {
                return name;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Names names = new Names();
        try{
            //List<String> namesFromFile = Files.readAllLines(Paths.get("src/main/resources/names.txt"));
           //List<String> namesFromFile = Files.readAllLines(Paths.get("src/main/resources/otherNames.txt"));
             List<String> namesFromFile = Files.readAllLines(Paths.get("src/main/resources/names_.txt"));
            System.out.println(names.findNameWithPrefix("dr", namesFromFile));
        }catch (IOException ioe){
            throw new IllegalStateException("Olvasasi hiba!", ioe);
        }finally {
            System.out.println("End of reading!");
        }

    }
}
