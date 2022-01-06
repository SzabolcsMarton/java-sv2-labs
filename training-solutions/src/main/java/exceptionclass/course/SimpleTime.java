package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        validateHoursAndMinsInRange(hour,minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeString){
       validateTimeString(timeString);
       int hourToSet = getHoursFromString(timeString);
       int minuteToSet = getMinutesFromString(timeString);
       validateHoursAndMinsInRange(hourToSet,minuteToSet);
       this.hour = hourToSet;
       this.minute = minuteToSet;

    }

    private void validateTimeString(String timeString){
        if(timeString == null){
            throw new InvalidTimeException("Time is null");
        }
        if( "hh:mm".length() != timeString.length())
            throw new InvalidTimeException("Time is not hh:mm");

        if(!timeString.substring(2,3).equals(":"))
            throw new InvalidTimeException("Time is not hh:mm");
    }

    private void validateHoursAndMinsInRange(int hours, int minutes){
        if(hours < 0 || hours > 23){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if(minutes < 0 || minutes > 59){
            throw  new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    private int getHoursFromString(String timeString){
        try {
            return Integer.parseInt(timeString.substring(0,2));
        }catch (NumberFormatException nfe){
            throw new InvalidTimeException("Time is not hh:mm", nfe);
        }
    }

    private int getMinutesFromString(String timeString){
        try {
            return Integer.parseInt(timeString.substring(3,5));
        }catch (NumberFormatException nfe){
            throw new InvalidTimeException("Time is not hh:mm",nfe);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}
