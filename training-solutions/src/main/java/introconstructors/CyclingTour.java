package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private int numberOfPeople;
    private LocalDate startTime;
    private  double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public  void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride( double kms){
        this.kms += kms;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Biking around in the city.",LocalDate.of(2021, 11, 04));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
        cyclingTour.registerPerson(3);
        cyclingTour.ride(15);
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

    }
}
