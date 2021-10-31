package formatlocaleprintf;

import java.util.ArrayList;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jozska");
        names.add("Sanyi Bacsi");
        names.add("Pirike");
        for (int i = 0; i < names.size(); i++){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n",names.get(i));
        }
    }
}
