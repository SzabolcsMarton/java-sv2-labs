package lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage>{

    private String provider;
    private int space;
    private double price;
    private PayPeriod payPeriod;

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price){
        this(provider,space);
        this.payPeriod = payPeriod;
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

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }

    @Override
    public int compareTo(CloudStorage other) {
        double value = 0;
        double otherValue = 0;
        if(this.payPeriod == null){
            return 0;
        }else {
            value = (this.price * 12 / this.payPeriod.getLength())/ this.space * 1000;
        }
        if(other.payPeriod == null){
            return 0;
        }else {
            otherValue = (other.price * 12 / other.payPeriod.getLength())/ other.space * 1000;
        }

        return Double.compare(value, otherValue);
    }
}
