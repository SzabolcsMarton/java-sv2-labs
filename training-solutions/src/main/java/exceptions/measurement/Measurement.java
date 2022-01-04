package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> fileReader(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
    }

    public List<String> validate(List<String> measurment) {
        List<String> faults = new ArrayList<>();
        for (String line : measurment) {
            if (!validateWholeLine(line)) {
                faults.add(line);
            }
        }
        return faults;
    }

    private boolean validateWholeLine(String line) {
        String[] lineParts = line.split(",");
        try {
            return validateLineParts(lineParts) &&
                    validateStringToNumber(lineParts[0]) &&
                    validateMeasuredValue(lineParts[1]) &&
                    validateName(lineParts[2]);
        }catch (IndexOutOfBoundsException ioe){
            return false;
        }

    }

    private boolean validateLineParts(String[] line) {
        return line.length == 3;
    }

    private boolean validateStringToNumber(String numberString) {
        try {
            int number = Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateMeasuredValue(String numberString) {
        try {
            double measuredValue = Double.parseDouble(numberString);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateName(String nameString) {
        String[] nameParts = nameString.split(" ");
        return nameParts.length == 2;
    }

}


