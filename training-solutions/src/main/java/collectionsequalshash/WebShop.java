package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Product> products;

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public int findHowMany(Product product){
        int count = 0;
        for (Product actual : products){
            if(product.equals(actual)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Product> productsInWebShop = new ArrayList<>();
        productsInWebShop.add(new Product("aaa","111"));
        productsInWebShop.add(new Product("bbb","222"));
        productsInWebShop.add(new Product("ccc","111"));
        productsInWebShop.add(new Product("ddd","333"));
        productsInWebShop.add(new Product("eee","111"));
        productsInWebShop.add(new Product("fff","444"));

        WebShop webShop = new WebShop(productsInWebShop);

        System.out.println(webShop.findHowMany(new Product("test","111")));
    }

}
