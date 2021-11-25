package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void createManTest(){
        RegisterDate registerDate = new RegisterDate("szuletes ideje", LocalDate.of(1980,10,11));
        List<RegisterDate> initial = new ArrayList<>();
        initial.add(registerDate);
        Man man = new Man("Kovacs Istvan",initial);

        assertEquals("Kovacs Istvan",man.getName());
        assertEquals(1, man.getRegisterDates().size());
    }

}