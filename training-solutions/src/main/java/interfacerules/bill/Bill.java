package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        try {
            List<String> temp =Files.readAllLines(path);
            return temp;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
}
