package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void testWithAccent(){
        assertEquals('e', new WithoutAccents().accentsConverter('é'));
    }

    @Test
    void  testWithoutAccent(){
        assertEquals('k', new WithoutAccents().accentsConverter('k'));
    }
}