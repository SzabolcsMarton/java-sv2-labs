package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store store1 = new Store("apple");
        Store store2 = new Store("alma");

        store1.store(10);
        System.out.println(store1.getProduct() +":" + store1.getStock()+ "pieces");
        store1.dispatch(5);
        System.out.println(store1.getProduct() +":" + store1.getStock()+ "pieces");

        store2.store(20);
        System.out.println(store2.getProduct() +":" + store2.getStock()+ "pieces");
        store2.dispatch(10);
        System.out.println(store2.getProduct() +":" + store2.getStock()+ "pieces");
    }
}
