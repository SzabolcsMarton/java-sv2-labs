package introexceptionwritefiletestjunit4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> readBookList() {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Olvasasi hiba", ioe);
        }
        return list;
    }

    private void writeToFile(Path path, List<String> toWrite){
        try {
            Files.write(path, toWrite);
        }catch (IOException ioe){
            throw new IllegalStateException("Hiba iras kozben", ioe);
        }
    }

    public void WriteFormatedBookList(Path path){
        List<String> formattedBookList = new ArrayList<>();
        List<String> books = readBookList();
        for(String actual: books){
            String[] s = actual.split(";");
            formattedBookList.add(s[2]+ ": " + s[1]);
        }
        writeToFile(path, formattedBookList);
    }




}
