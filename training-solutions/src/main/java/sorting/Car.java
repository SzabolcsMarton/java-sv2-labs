package sorting;

public class Car {
    private String Brand;
    private int madeIn;
    private int price;

    public Car(String brand, int madeIn, int price) {
        Brand = brand;
        this.madeIn = madeIn;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public int getMadeIn() {
        return madeIn;
    }

    public int getPrice() {
        return price;
    }
}
