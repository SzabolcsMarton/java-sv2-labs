package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    private Student student = new Student();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddNote() {
        student.addNote(2);
        student.addNote(5);


        assertEquals(2, student.getNotes().size());
        assertEquals(2, student.getNotes().get(0).intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteSimpleExpection() {
        student.addNote(8);
    }

    @Test
    public void testAddNoteExpectedException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        student.addNote(8);
    }

    @Test
    public void testAddNoteAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(8));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}