package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Starking());
        list.add(new Vegetable());
        list.add("alma");
        list.add(12);
        list.add('x');
        list.add(LocalDate.of(2021,10,12));
        list.add(new int[]{1, 2, 3});
        list.add(new ArrayList<>(Arrays.asList("a", "b", "c")));

        System.out.println(list);
    }
}
