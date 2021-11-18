package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school = new School();

    @Test
    void getNumberOfStudentsTest(){
        List<Integer> studentsOfClasses = Arrays.asList(20, 30, 40, 20, 35);

        int numberOfPupils = school.getNumberOfStudents(studentsOfClasses);

        assertEquals(145, numberOfPupils);
    }

}