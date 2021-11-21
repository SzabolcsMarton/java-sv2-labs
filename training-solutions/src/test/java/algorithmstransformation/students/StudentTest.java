package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudentTest(){
        Student student = new Student("Kovacs Pisti","Budapest Fo utca 114.");

        assertEquals("Kovacs Pisti",student.getName());
        assertEquals("Budapest Fo utca 114.", student.getAddress());
    }

}