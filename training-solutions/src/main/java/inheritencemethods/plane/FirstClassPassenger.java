package inheritencemethods.plane;

public class FirstClassPassenger extends PriorityPassenger{

    private final int extraCharge = 20_000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int PERCENT) {
        super(name, priceOfPlaneTicket, PERCENT);
    }

    public int getExtraCharge() {
        return extraCharge;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return super.getPriceOfPlaneTicket() + 20_000;
    }
}
