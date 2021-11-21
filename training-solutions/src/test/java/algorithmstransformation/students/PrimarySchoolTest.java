package algorithmstransformation.students;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool school;

    @BeforeEach
    void init(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kovacs Pisti", 13,"Budapest Fo utca 7."));
        persons.add(new Person("Gal Adam", 32,"Budapest Alma utca 15."));
        persons.add(new Person("Nagy Osolya", 10,"Budapest Teveutca 25."));
        persons.add(new Person("Mezei Anna", 27,"Budapest Fo utca 27."));
        persons.add(new Person("Kovacs Kata", 7,"Budapest Doboz utca 1."));
        persons.add(new Person("Toth Jozsika", 8,"Budapest Pok utca 7."));

        school = new PrimarySchool(persons);
    }

    @Test
    void getStudentsTest(){
        List<Student> students = school.getStudents();

        assertEquals(4, students.size());
    }

}