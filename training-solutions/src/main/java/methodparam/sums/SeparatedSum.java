package methodparam.sums;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFile() {
        try {
            List<String> numberString = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return numberString.get(0);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Olvasasi hiba", ioe);
        }
    }

    public SumResult sum(String floatingNumbers) {
        double sumPos = 0;
        double sumNeg = 0;

        String[] numbersWithDot = floatingNumbers.replace(",", ".").split(";");

        for (String actual : numbersWithDot) {
            double parsedNumber = Double.parseDouble(actual);
            if (parsedNumber < 0) {
                sumNeg += parsedNumber;
            } else {
                sumPos += parsedNumber;
            }
        }
        return new SumResult(sumPos, sumNeg);
    }
}
