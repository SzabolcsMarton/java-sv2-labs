package interfacedefaultmethods.cloth;

public class TableCloth implements Square{

    private double side;

    public TableCloth(double side) {
        this.side = side;
    }

    public double getSide(){
        return side;
    }
}
