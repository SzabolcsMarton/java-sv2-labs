package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void createWomanTest(){
        RegisterDate registerDate = new RegisterDate("szuletes ideje", LocalDate.of(1983,11,10));
        List<RegisterDate> initial = new ArrayList<>();
        initial.add(registerDate);
        Woman woman = new Woman("Kiss Julia",initial);

        assertEquals("Kiss Julia",woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
    }

}