package objectclass.simplebag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();

    private int coursor;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        coursor = -1;
    }

    public boolean hasNext() {
        return !(isEmpty() || coursor >= items.size() - 1);
    }

    public Object next(){
        coursor++;
        return items.get(coursor);
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor(){
        return coursor;
    }
}
