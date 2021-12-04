package interfacerules.bill;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path){
        try {
            List<String> result = Files.readAllLines(path);
            return result;
        }catch (IOException ioe){
            throw new IllegalArgumentException("Can not read file", ioe);
        }
    }

}
