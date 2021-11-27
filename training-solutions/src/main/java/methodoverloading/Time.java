package methodoverloading;

public class Time {

    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private int getInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public boolean isEqual(Time time) {
        return this.getInSeconds() == time.getInSeconds();
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        Time timeToCheck = new Time(hours, minutes, seconds);
        return this.getInSeconds() == timeToCheck.getInSeconds();
    }

    public boolean isEarlier(Time time) {
        return this.getInSeconds() < time.getInSeconds();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        Time timeToCheck = new Time(hours, minutes, seconds);
        return this.getInSeconds() < timeToCheck.getInSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
