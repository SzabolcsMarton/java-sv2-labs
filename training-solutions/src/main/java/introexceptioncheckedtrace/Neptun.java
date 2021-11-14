package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public List<String> fileReader() throws IOException {
       return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }


    public static void main(String[] args) {
        List<String> neptunDatas = new ArrayList<>();
        List<String> neptuneCodes = new ArrayList<>();

        try{
            neptunDatas = new Neptun().fileReader();
        }catch (IOException ioe){
            System.out.println("olvasasi hiba, a file nem talalhato!");
        }

        for (String datasToSplit : neptunDatas){
            neptuneCodes.add(datasToSplit.split(",")[1]);
        }

        System.out.println(neptuneCodes);
    }


}
