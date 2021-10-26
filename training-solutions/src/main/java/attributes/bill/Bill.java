package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("kapa", 1000,1,25.25);
        System.out.println("Product: " + billItem.getProduct());
        System.out.println("Price: " + billItem.getPrice());
        System.out.println("Pieces: " + billItem.getQuantity());
        System.out.println("VAT: " + billItem.getVatPercent() + "%");
        System.out.println();
        System.out.println("Total: " + billItem.calculateTotalPrice());
    }
}
