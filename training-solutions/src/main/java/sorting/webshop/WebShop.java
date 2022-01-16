package sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public void addNewProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProductsOrderedByName() {
        List<Product> result = new ArrayList<>(products);
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return result;
    }

    public List<Product> getProductsOrderedByPrice() {
        List<Product> result = new ArrayList<>(products);
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        return result;
    }

    public List<Product> getProductsOrderedByDateFrom() {
        List<Product> result = new ArrayList<>(products);
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });

        return result;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
