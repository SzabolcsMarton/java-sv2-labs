package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner productScanner = new Scanner(System.in);
        System.out.println("Name of Product:");
        String nameOfProduct = productScanner.nextLine();

        System.out.println("Price: ");
        int priceOfProduct = productScanner.nextInt();

        Product product = new Product(nameOfProduct,priceOfProduct);
        System.out.println("Name: " + product.getName() + "  Price: " + product.getPrice());

        product.increasePrice(200);
        System.out.println("Name: " + product.getName() + "  Price: " + product.getPrice());

        product.decreasePrice(100);
        System.out.println("Name: " + product.getName() + "  Price: " + product.getPrice());

    }
}

