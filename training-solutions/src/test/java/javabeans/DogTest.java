package javabeans;

import org.junit.jupiter.api.Test;
import stringconcat.nameconcat.Name;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getAndSetNameTest(){
        Dog dog = new Dog();
        dog.setName("Kutyanev");

        assertEquals("Kutyanev",dog.getName());
    }

    @Test
    void getAndSetAgeTest(){
        Dog dog = new Dog();
        dog.setAge(5);

        assertEquals(5,dog.getAge());
    }

    @Test
    void isPedigreeGetAndSetTest(){
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertTrue(dog.isPedigree());
    }

    @Test
    void getAndSetWeightTest(){
        Dog dog = new Dog();
        dog.setWeight(8.5);

        assertEquals(8.5,dog.getWeight());
    }

}