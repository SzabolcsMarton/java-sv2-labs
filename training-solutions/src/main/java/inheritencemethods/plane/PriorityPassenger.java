package inheritencemethods.plane;

public class PriorityPassenger extends Passenger{

    private final int PERCENT;

    public PriorityPassenger(String name, int priceOfPlaneTicket, int PERCENT) {
        super(name, priceOfPlaneTicket);
        this.PERCENT = PERCENT;
    }

    public int getPERCENT() {
        return PERCENT;
    }

    @Override
    public int getPriceOfPlaneTicket(){
        return (super.getPriceOfPlaneTicket() / 100) * (  100 + PERCENT);
    }
}
