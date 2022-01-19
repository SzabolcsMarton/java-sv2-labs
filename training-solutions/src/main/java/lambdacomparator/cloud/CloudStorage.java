package lambdacomparator.cloud;

public class CloudStorage {

    private String provider;
    private int space;
    private double price;

    public CloudStorage(String provider, int space, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }
}
