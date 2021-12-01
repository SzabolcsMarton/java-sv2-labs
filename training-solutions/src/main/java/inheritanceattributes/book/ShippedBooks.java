package inheritanceattributes.book;

public class ShippedBooks extends Book {

    private int shippingCost;

    public ShippedBooks(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces){
        return purchase(pieces) + shippingCost;
    }
    public String toString(){
        return getTitle() + ": " + price + " Ft, postakoltseg: " + shippingCost + " Ft";
        //"Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft"
    }
}
