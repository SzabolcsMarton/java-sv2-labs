package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021,10,27);
        String artist = "Queen";
        LocalTime start = LocalTime.of(20,00,00);
        LocalTime end = LocalTime.of(21,30,00);

        Performance performance = new Performance(date,artist,start,end);

        System.out.println(performance.getArtist() + "\n" +
                performance.getDate() + "\n" +
                performance.getStartTime() + "\n" +
                performance.getEndTime() + "\n" +
                performance.getInfo());
    }
}
