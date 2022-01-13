package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    void testCreate() {
        Food food = new Food("a", LocalDate.of(2022, 2, 2));

        assertEquals("a", food.getName());
        assertEquals(LocalDate.of(2022, 2, 2), food.getExpirationDate());
    }

}