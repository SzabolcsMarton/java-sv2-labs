package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public  int getInMinutes() {
        return hours * 60;
    }

    public int getInSeconds(){
        return getInMinutes() * 60 + seconds;
    }

    public  boolean earlierThan(Time otherTime){
        return this.getInSeconds() < otherTime.getInSeconds();
    }

    public  String toString() {
        return hours + " : " + minutes + " : " + seconds;
    }

}