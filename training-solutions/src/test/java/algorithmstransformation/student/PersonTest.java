package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void createPersonTest(){
        Person person = new Person("Sanyi bacsi", 38, "Budapest  Alma utca 8.");

        assertEquals("Sanyi bacsi",person.getName());
        assertEquals(38,person.getAge());
        assertEquals("Budapest  Alma utca 8.",person.getAddress());
    }

}