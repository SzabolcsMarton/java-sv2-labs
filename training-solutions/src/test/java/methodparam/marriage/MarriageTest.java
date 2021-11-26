package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void getMarriage(){
        Marriage marriage = new Marriage();
        Woman woman = new Woman("Jogo Bella",
                new ArrayList<>(Arrays.asList(new RegisterDate("szuletes",
                        LocalDate.of(1990,5,4)))));
        Man man = new Man("Gipsz Elek",
                new ArrayList<>(Arrays.asList(new RegisterDate("szuletes",
                        LocalDate.of(1985,10,5)))));
        marriage.getMarried(woman,man);

        assertEquals("Gipszné Jogo Bella", woman.getName());
        assertEquals(2, man.getRegisterDates().size());


    }

}