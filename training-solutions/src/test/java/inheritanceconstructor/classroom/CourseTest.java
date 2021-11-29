package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void createCourceTest(){
        Course course = new Course(20,Facility.PROJECTOR);
        assertEquals(20, course.getParticipants());
        assertEquals(Facility.PROJECTOR, course.getFacilityNeeded());
    }

}