package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    public String writeFlavors(List<String> flavors){
        StringBuilder sb = new StringBuilder("Mai izek: \n");
        for (int i = 0; i < flavors.size(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(flavors.get(i));
        }
        sb.append("\n");
        sb.append("Gyerekeknek felaron!!");
        return sb.toString();
    }

    public static void main(String[] args) {

        IceCream iceCream = new IceCream();

        List<String> flavors = new ArrayList<>();
        flavors.add("csoki");
        flavors.add("vanilia");
        flavors.add("eper");
        flavors.add("citrom");
        flavors.add("puncs");

        System.out.println(iceCream.writeFlavors(flavors));
    }


}
