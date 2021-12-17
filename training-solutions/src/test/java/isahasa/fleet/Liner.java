package isahasa.fleet;

public class Liner implements Ship,CanCarryPassengers{

    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers) {
        this.canCarryPassengers = new CanCarryPassengerBehavior(maxPassengers);
    }

    @Override
    public int loadPassengers(int passengers) {
        return canCarryPassengers.loadPassengers(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
