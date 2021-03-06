package isahasa.fleet;

public class CanCarryPassengersBehavior implements CanCarryPassengers{

    private int passengers;

    private final int maxPassengers;

    public CanCarryPassengersBehavior(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassengers(int passengers) {
        int leftOver = 0;
        if(passengers <= maxPassengers){
            this.passengers = passengers;
        }else{
            leftOver = passengers - maxPassengers;
            this.passengers = maxPassengers;
        }
        return leftOver;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
