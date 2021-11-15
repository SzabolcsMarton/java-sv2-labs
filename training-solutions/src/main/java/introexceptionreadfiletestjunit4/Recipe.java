package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        List<String> recipe = readRecipe(path);
        for (int i = 2; i < recipe.size(); i++) {
            ingredients.add(recipe.get(i).split(" ")[2]);
        }
    }

    private List<String> readRecipe(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Olvasasi hiba!", ioe);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
