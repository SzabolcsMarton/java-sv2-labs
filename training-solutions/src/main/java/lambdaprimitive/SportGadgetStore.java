package lambdaprimitive;

import java.util.*;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products
                .stream()
                .mapToInt(Product::getPieces)
                .sum();
    }

    public double getAveragePrice() {
        return products
                .stream()
                .mapToDouble(Product::getPrice)
                .average().orElse(0.0);
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stat = products
                .stream()
                .filter(product -> product.getPrice() > minPrice)
                .mapToInt(Product::getPieces)
                .summaryStatistics();
        StringBuilder stringBuilder = new StringBuilder();
        if (stat.getCount() == 0) {
            return "Nincs ilyen termék.";
        }
        return stringBuilder.append("Összesen ")
                .append(stat.getCount())
                .append(" féle termék, amelyekből minimum ")
                .append(stat.getMin()).append(" db, maximum ")
                .append(stat.getMax())
                .append(" db, összesen ")
                .append(stat.getSum())
                .append(" db van.").toString();

    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
