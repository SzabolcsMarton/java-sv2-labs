package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private double price;

    public Pendrive(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    private double getPricePerCapacity(){
        return price / capacity;
    }

    public void risePrise(int percent) {
        price += price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other){
        double pricePerCapacity = getPricePerCapacity();
        double otherPricePerCapacity = other.getPricePerCapacity();
        if(pricePerCapacity > otherPricePerCapacity){
            return 1;
        }
        if(pricePerCapacity < otherPricePerCapacity){
            return  -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other){
        return this.price < other.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive { name='" + name +
                ", capacity=" + capacity +
                ", price=" + price + " }";
    }
}
