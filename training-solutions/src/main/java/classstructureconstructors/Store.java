package classstructureconstructors;

public class Store {
    private String product;
    private int stock = 0;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
    public void store(int piecesIntoStore) {
        stock += piecesIntoStore;
    }

    public  void  dispatch(int piecesOutOfStore) {
        stock -= piecesOutOfStore;
    }
}
