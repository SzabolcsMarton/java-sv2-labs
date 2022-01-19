package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cakes = new ArrayList<>();

    public void addCakes(Cake cake) {
        cakes.add(cake);
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        return cakes.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(Cake::getName)
                .collect(Collectors.toList());
    }

    public List<String> listCakeNamesWithMaxIngredients(int max){
        return cakes.stream()
                .filter(cake -> cake.getIngredients().size() <= max).map(Cake::getName)
                .collect(Collectors.toList());
    }


    public List<Cake> getCakes() {
        return cakes;
    }
}
