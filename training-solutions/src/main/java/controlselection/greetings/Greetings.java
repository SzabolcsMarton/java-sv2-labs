package controlselection.greetings;

public class Greetings {
    private final int HOURS_IN_MINUTES = 60;
    private String greeting;

    public String greet(int hours,int minutes){
        int sumMinutes = hours * HOURS_IN_MINUTES + minutes;

        if(sumMinutes <= 5 * HOURS_IN_MINUTES || sumMinutes > 20 * HOURS_IN_MINUTES){
            greeting = "Jo ejt!";
        }else if(sumMinutes > 5 * HOURS_IN_MINUTES && sumMinutes <= 9 * HOURS_IN_MINUTES){
            greeting = "Jo reggelt!";
        }else if (sumMinutes > 9 * HOURS_IN_MINUTES && sumMinutes <= 18 * HOURS_IN_MINUTES +30){
            greeting = "Jo napot!";
        }else {
            greeting = "Jo estet!";
        }
        return greeting;
    }

}
