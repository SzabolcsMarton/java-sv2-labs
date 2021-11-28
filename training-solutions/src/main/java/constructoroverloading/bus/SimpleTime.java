package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public SimpleTime(int hours){
        this(hours, 0);

    }
    public SimpleTime(SimpleTime time){
        this(time.hours, time.minutes);
    }

    private int timeToMinute(SimpleTime time){
        return time.getHours() * 60 + time.getMinutes();
    }

    public int getDifference(SimpleTime time){
        return (timeToMinute(this) - timeToMinute(time));
    }

    public String toString(){
        return hours + " : " + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
