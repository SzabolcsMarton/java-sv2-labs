package inheritencemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void createPersonTest(){
        Person person = new Person("Sanyi bacsi", "Budapest V. ker");

        assertEquals("Sanyi bacsi", person.getName());
        assertEquals("Budapest V. ker", person.getAddress());

    }

    @Test
    void migrateTest(){
        Person person = new Person("Sanyi bacsi", "Budapest V. ker");
        person.migrate("Budapest VI. ker");

        assertEquals("Budapest VI. ker", person.getAddress());
    }

}