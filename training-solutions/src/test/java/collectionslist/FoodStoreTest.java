package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    @Test
    void sellFirstTest() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("a", LocalDate.now()));
        foodStore.addFood(new Food("b", LocalDate.now().plusDays(1)));
        foodStore.sellFirst(new Food("d", LocalDate.now()));

        assertEquals(3, foodStore.getFoods().size());
        assertEquals("d", foodStore.getFoods().get(0).getName());
    }
}