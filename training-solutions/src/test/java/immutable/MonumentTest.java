package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void createMonumentTest() {
        Monument m = new Monument("Szobor", "Budapest", LocalDate.of(2010, 10, 24), "12321");

        assertEquals("Szobor",m.getName());
        assertEquals("Budapest",m.getAddress());
        assertEquals(LocalDate.of(2010,10,24),m.getDateOfRegistry());
        assertEquals("12321",m.getRegNumber());
    }

    @Test
    void createMonumentWithNullNameTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument(null, "Budapest", LocalDate.of(2010, 10, 24), "12321"));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }

    @Test
    void createMonumentWithEmptyNameTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("", "Budapest", LocalDate.of(2010, 10, 24), "12321"));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }


    @Test
    void createMonumentWithNullAddressTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("Szobor", null, LocalDate.of(2010, 10, 24), "12321"));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }

    @Test
    void createMonumentWithEmptyAddressTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("Szobor", "", LocalDate.of(2010, 10, 24), "12321"));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }


    @Test
    void createMonumentWithNullRegNumberTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("Budapest", "Budapest", LocalDate.of(2010, 10, 24), null));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }

    @Test
    void createMonumentWithEmptyRegNumberTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Monument("Budapest", "Budapest", LocalDate.of(2010, 10, 24), ""));
        assertEquals("Name, address or registry number cannot be empty!",exception.getMessage());
    }

}