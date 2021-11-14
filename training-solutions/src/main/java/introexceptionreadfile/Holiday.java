package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try{
            List<String> holidayStaff = Files.readAllLines(Paths.get("holiday.txt"));
            System.out.println(holidayStaff);
        }catch (IOException ioe){
            System.out.println("File olvasasi hiba, file nem talalhato!");
        }
    }
}
