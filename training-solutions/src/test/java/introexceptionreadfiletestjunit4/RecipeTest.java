package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    public void testAddIngredients(){
        Path path = Paths.get("src/test/resources/recipe.txt");
        recipe.addIngredients(path);

        assertEquals(10,recipe.getIngredients().size());
    }

}