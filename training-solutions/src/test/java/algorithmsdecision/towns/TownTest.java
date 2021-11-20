package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitantsTest(){
        Town town = new Town();
        List<Integer> cities = Arrays.asList(875, 687, 1203, 957, 654, 1001);

        assertEquals(true,town.containsFewerHabitants(cities,700));
        assertEquals(false,town.containsFewerHabitants(cities,400));
        assertTrue(town.containsFewerHabitants(cities,800));
        assertFalse(town.containsFewerHabitants(cities,300));
    }

}