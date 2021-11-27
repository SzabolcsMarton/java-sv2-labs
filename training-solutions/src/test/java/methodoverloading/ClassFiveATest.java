package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void getTodayReferringStudentWithIntTest(){
        assertEquals("Han Solo", classFiveA.getTodayReferringStudent(4));
        assertEquals("Han Solo", classFiveA.getTodayReferringStudent("four"));
        assertEquals("Han Solo", classFiveA.getTodayReferringStudent(Number.FOUR));
    }

}