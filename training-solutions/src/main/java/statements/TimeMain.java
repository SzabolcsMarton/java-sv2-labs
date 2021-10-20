package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner timeScanner = new Scanner(System.in);

        System.out.println("Első időpont óra: ");
        int time1Hours = timeScanner.nextInt();
        System.out.println("Első időpont perc: ");
        int time1minutes = timeScanner.nextInt();
        System.out.println("Első időpont másodperc: ");
        int time1seconds = timeScanner.nextInt();

        System.out.println("Második időpont óra: ");
        int time2Hours = timeScanner.nextInt();
        System.out.println("Második időpont perc: ");
        int time2minutes = timeScanner.nextInt();
        System.out.println("Második időpont másodperc: ");
        int time2seconds = timeScanner.nextInt();

        Time time1 = new Time(time1Hours,time1minutes,time1seconds);
        Time time2 = new Time(time2Hours,time2minutes,time2seconds);

        System.out.println("Az eslő időpont " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("A második időpont " + time2.toString() + " = " + time2.getInSeconds() + "másodperc");
        System.out.println("Az első korábbi mint a második: " + time1.earlierThan(time2));
    }
}
