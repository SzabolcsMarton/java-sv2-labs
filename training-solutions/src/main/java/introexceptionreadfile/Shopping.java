package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try{
            List<String> shoppingStaff = Files.readAllLines(Paths.get("src/main/resources/holiday.txt"));
            System.out.println(shoppingStaff);
        }catch (IOException ioe){
            System.out.println("File olvasasi hiba, file nem talalhato!");
        }
    }
}
