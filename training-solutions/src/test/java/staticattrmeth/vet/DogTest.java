package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void createDogTest(){
        Dog dog = new Dog("Ubul",8,Species.GOLDEN_RETRIEVER);
        dog.setCodeNr(1);

        assertEquals("Ubul", dog.getName());
        assertEquals(8, dog.getAge());
        assertEquals(Species.GOLDEN_RETRIEVER, dog.getSpecies());
        assertEquals(1,dog.getCodeNr());
    }

}