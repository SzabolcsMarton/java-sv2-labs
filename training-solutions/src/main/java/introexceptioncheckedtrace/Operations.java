package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> stringsToCheck){
        StringBuilder sb = new StringBuilder(LocalDate.now().toString() + ", ");
        for (String actual : stringsToCheck){
           if(actual.startsWith("2")){
               sb.append(actual).append(" ");
           }
        }
        return sb.toString();
    }


}
