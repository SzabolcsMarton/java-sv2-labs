package introexceptionwritefile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Adja meg hany adatot szeretne rogziteni!");
        int number = scnr.nextInt();
        scnr.nextLine();

        List<String> birthdays = new ArrayList<>();
        for(int i = 0; i < number; i++){
            System.out.println("Neve:");
            String name = scnr.nextLine();
            System.out.println("Szuletett:");
            String birth = scnr.nextLine();
            birthdays.add(name + ", " + birth);
        }

        Path path = Paths.get("src/main/resources/birthdays.txt");
        try {
            Files.write(path,birthdays);
        }catch (IOException ioe){
            throw new IllegalStateException("Hiba tortent a file irasa kozben!");
        }
    }
}
