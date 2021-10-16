package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner musicScanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Band of the Song:");
        song.band = musicScanner.nextLine();

        System.out.println("Title of the Song:");
        song.title = musicScanner.nextLine();

        System.out.println("Lenght of the Song:");
        song.lenght = musicScanner.nextInt();

        System.out.println(song.band + " - " + song.title + "  (" + song.lenght + " perc)");
    }
}
