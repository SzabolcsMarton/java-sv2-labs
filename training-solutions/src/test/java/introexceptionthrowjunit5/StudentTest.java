package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student();

    @Test
    void testAddCorrectNotes(){
        student.addNotes(3);

        assertEquals(3,student.getNotes().get(0));
    }

    @Test
    void testAddIncorrectNotes(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNotes(8));
        assertEquals("Note must be between 1 and 5!",exception.getMessage());
    }
}