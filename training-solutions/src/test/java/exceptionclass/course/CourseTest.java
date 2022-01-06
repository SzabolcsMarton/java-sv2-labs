package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void createTestWithNullName(){
        String name= null;
        SimpleTime begin = new SimpleTime(2,30);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Name is null", ex.getMessage());
    }

    @Test
    void createTestWithNullBegin(){
        String name = "AnyCourse";
        SimpleTime begin = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Begin is null", ex.getMessage());
    }

    @Test
    void createTest() {
        String name = "AnyCourse";
        SimpleTime begin = new SimpleTime("02:30");
        Course course = new Course(name, begin);

        assertEquals(name, course.getName());
        assertEquals(begin, course.getBegin());
    }

    @Test
    void toStringTest(){
        String name = "AnyCourse";
        SimpleTime begin = new SimpleTime("02:30");
        Course course = new Course(name, begin);

        assertEquals("02:30: AnyCourse", course.toString());
    }



}