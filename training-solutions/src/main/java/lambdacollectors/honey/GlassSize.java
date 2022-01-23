package lambdacollectors.honey;

public enum GlassSize {
    BIG(1.0), SMALL(0.5), TASTER_SIZE(0.05);

    private double kgPerGlass;

    GlassSize(double kgPerGlass) {
        this.kgPerGlass = kgPerGlass;
    }

    public double getKgPerGlass() {
        return kgPerGlass;
    }
}
