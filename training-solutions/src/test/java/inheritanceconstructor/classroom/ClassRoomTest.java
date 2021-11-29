package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void createClassRoomTest(){
        ClassRoom classRoom = new ClassRoom("I. emelet", 30,Facility.PROJECTOR);

        assertEquals("I. emelet",classRoom.getLocation());
        assertEquals(30, classRoom.getCapacity());
        assertEquals(Facility.PROJECTOR, classRoom.getFacility());
    }

    @Test
    void isSuitablePassTest(){
        ClassRoom classRoom = new ClassRoom("I. emelet", 30,Facility.PROJECTOR);

        assertTrue(classRoom.isSuitable(new Course(20,Facility.PROJECTOR)));
    }

    @Test
    void isSuitableFailTest(){
        ClassRoom classRoom = new ClassRoom("I. emelet", 30,Facility.PROJECTOR);

        assertFalse(classRoom.isSuitable(new Course(40,Facility.PROJECTOR)));
    }

}