package collectionsequalshash;

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

}
