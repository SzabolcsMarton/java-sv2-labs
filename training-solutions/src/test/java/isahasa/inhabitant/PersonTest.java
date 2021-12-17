package isahasa.inhabitant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void createTest(){
        Person person = new Person("SanyiBacsi");

        assertEquals("SanyiBacsi", person.getName());
    }

}