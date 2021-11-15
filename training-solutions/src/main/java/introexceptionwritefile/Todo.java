package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        List<String> todos = new ArrayList<>();
        boolean end = false;
        while (end == false) {
            System.out.println("Adja meg a következő tennivalót majd enter! Kilépés x lenyomásával!");
            String todo = scnr.nextLine().toLowerCase();
            if (todo.equals("x")) {
                end = true;
            } else {
                todos.add(todo);
            }
        }

        Path path = Paths.get("src/main/resources/todos.txt");

        try {
            Files.write(path, todos);
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a file irása közben!");
        }
    }
}
