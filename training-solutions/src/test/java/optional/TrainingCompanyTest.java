package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainingCompanyTest {

    TrainingCompany company;

    @BeforeEach
    void init() {
        List<Course> courses = Arrays.asList(
                new Course("Kertészkedés", 78000, Level.ADVANCED),
                new Course("Fodrász",  153000 ,Level.BEGINNER),
                new Course("Angol nyelvtanfolyam",35000,Level.BEGINNER),
                new Course("Biztonsági őr", 145000,Level.ADVANCED),
                new Course("Bér- és TB ügyintéző", 86000,Level.BEGINNER)
        );
        company = new TrainingCompany(courses);
    }

    @Test
    void testGetCheaperCourse() {
        Course expected = company.getCheaperCourse(80000);

        assertEquals("Angol nyelvtanfolyam", expected.getCourseName());
        assertEquals(35000, expected.getPrice());
    }

    @Test
    void testGetCheaperCourseNoSuchCourse() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> company.getCheaperCourse(100));
        assertEquals("No such course.", ex.getMessage());
    }

    @Test
    void testGetPriceOfCourseWithGivenNameAndLevel() {
        assertEquals(145000, company.getPriceOfCourseWithGivenNameAndLevel("Biztonsági őr", Level.ADVANCED));
    }

    @Test
    void testGetPriceOfCourseWithGivenNameAndLevelNoSuchCourse() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> company.getPriceOfCourseWithGivenNameAndLevel("Titkárnő", Level.BEGINNER));
        assertEquals("No such course.", ex.getMessage());
    }

    @Test
    void testGetNameOfCourseWithGivenLevel() {
        assertEquals("Bér- és TB ügyintéző", company.getNameOfCourseWithGivenLevel(Level.BEGINNER));
    }

    @Test
    void testGetNameOfCourseWithGivenLevelNoCourseFound() {
        assertEquals("Sorry, there is no course at this level.", company.getNameOfCourseWithGivenLevel(Level.EXPERT));
    }
}