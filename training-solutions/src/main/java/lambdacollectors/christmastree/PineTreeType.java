package lambdacollectors.christmastree;

public enum PineTreeType {
    NORDMANN(10_000), SILVER(8_000), SPRUCE(4_000);

    private int pricePerMeter;

    public int getPricePerMeter() {
        return pricePerMeter;
    }

    PineTreeType(int pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }
}
