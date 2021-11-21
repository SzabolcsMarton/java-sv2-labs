package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void init() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("zebra", 4));
        animals.add(new Animal("teve", 4));
        animals.add(new Animal("strucc", 2));
        animals.add(new Animal("emu", 2));
        zoo = new Zoo(animals);

    }

    @Test
    void addAnimalTest(){
        zoo.addAnimal(new Animal("pingvin", 2));
        assertEquals(5,zoo.getAnimals().size());
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> expected = zoo.getAnimalsWithNumberOfLegsGiven(2);

        assertEquals(2, expected.size());
    }



}