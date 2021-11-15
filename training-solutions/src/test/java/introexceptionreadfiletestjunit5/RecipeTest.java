package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows



public class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    public void testAddIngredients(){
        Path path = Paths.get("src/test/resources/recipe.txt");
        recipe.addIngredients(path);

        assertEquals(10,recipe.getIngredients().size());
    }

    @Test
    public void testAddIngredientsWronPath(){
        Path path = Paths.get("src/test/resources/recipe_.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                ()-> recipe.addIngredients(path));
        assertEquals("Olvasasi hiba!",exception.getMessage());
    }

}