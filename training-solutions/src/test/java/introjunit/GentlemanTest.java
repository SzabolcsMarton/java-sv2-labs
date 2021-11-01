package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentlemanTest {

    @Test
    public void testCreate(){

        //Given
        String name = "John Doe";
        //When
        String greeting = new GentleMan().sayHello(name);

        assertEquals("Hello John Doe",greeting);
    }
    @Test
    public void testCreate2(){
        String name = null;

        String greeting = new GentleMan().sayHello(name);

        assertEquals("Hello Anonymus",greeting);


    }

}
