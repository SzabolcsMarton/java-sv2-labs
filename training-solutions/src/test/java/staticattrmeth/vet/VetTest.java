package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addDogTest(){
        Vet vet = new Vet();
        vet.addDog(new Dog("Bloki",6,Species.LABRADOR));

        assertEquals(2,Vet.getCode());
        assertEquals(1,vet.getRegisteredDogs().get(0).getCodeNr());
    }


}