package finalmodifier;

public class TaxCalculator {
    public static final double TAX_RATE = 27.0;

    public  double tax( double price) {
        return  (TAX_RATE / price) * 100;
    }

    public double priceWithTax( double price) {
        return price += tax(price);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(1000));
        System.out.println(taxCalculator.priceWithTax(1000));
    }

}
