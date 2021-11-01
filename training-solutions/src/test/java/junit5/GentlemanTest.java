package junit5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

//    @Test
//    public void testCreate(){
//        String name = "John Doe";
//
//        String greeting = new Gentleman().sayHello(name);
//
//        assertEquals("Hello John Doe",greeting);
//    }
    @Test
    public void testCreate(){
        String name = "John";

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello John",greeting);
    }
    @Test
    public void testCreate2(){
        String name = null;

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello Anonymus",greeting);
    }
}
