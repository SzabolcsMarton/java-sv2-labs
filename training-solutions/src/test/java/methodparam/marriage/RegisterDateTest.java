package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void createRegisterDatesTest(){
        RegisterDate rg = new RegisterDate("leiras", LocalDate.of(1985,12,4));

        assertEquals(LocalDate.of(1985,12,4), rg.getDate());
        assertEquals("leiras",rg.getDescrirption());
    }

}