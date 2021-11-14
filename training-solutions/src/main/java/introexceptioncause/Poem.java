package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> linesOfPoem = new ArrayList<>();
        try{
            linesOfPoem = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));

        }catch (IOException ioe){
            throw new IllegalStateException("Olvasasi hiba, a file nem talalhato!");
        }
        for (String line : linesOfPoem) {
            System.out.print(line.charAt(0));
        }
    }
}
