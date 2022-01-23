package lambdacollectors.christmastree;

public class ChristmasTree {

    private PineTreeType type;
    private double height;

    public ChristmasTree(PineTreeType type, double height) {
        this.type = type;
        this.height = height;
    }

    public PineTreeType getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return this.height * this.type.getPricePerMeter();
    }
}
