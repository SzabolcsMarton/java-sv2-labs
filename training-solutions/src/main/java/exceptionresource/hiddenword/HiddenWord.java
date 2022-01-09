package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return getWordFromFile(scanner);
        } catch (IOException ioe) {
            throw new IllegalStateException("Problem while reading file", ioe);
        }
    }

    private char findLetterCharacterInString(String stringToFindLetter) {
        char[] characters = stringToFindLetter.toCharArray();
        for (char actual : characters) {
            if (!Character.isDigit(actual)) {
                return actual;
            }
        }
        return ' ';
    }

    private String getWordFromFile(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char letterFromFile = findLetterCharacterInString(line);
            stringBuilder.append(letterFromFile);
        }
        return stringBuilder.toString();
    }
}
