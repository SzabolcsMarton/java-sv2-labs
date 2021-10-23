package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kedvenc film:");
        String favMovie = scanner.nextLine();
        System.out.println("Kedvenc szin:");
        String favColor = scanner.nextLine();
        System.out.println("Kedvenc barmi:");
        String favAnything = scanner.nextLine();

        favouriteThings.add(favMovie);
        favouriteThings.add(favColor);
        favouriteThings.add(favAnything);

        System.out.println(favouriteThings);
        System.out.println(favouriteThings.size());
    }
}
