package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void createAnimalTest() {
        Animal animal = new Animal("teve", 4);

        assertEquals("teve", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }

}