package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void testGreeting(){
        Greetings greetings = new Greetings();
        assertEquals("Jo reggelt!",greetings.greet(5,1));
        assertEquals("Jo reggelt!",greetings.greet(9,0));
        assertEquals("Jo napot!", greetings.greet(9,1));
        assertEquals("Jo napot!", greetings.greet(18,30));
        assertEquals("Jo estet!", greetings.greet(18,31));
        assertEquals("Jo estet!", greetings.greet(20, 0));
        assertEquals("Jo ejt!", greetings.greet(20,1));
        assertEquals("Jo ejt!", greetings.greet(5,0));
    }


}