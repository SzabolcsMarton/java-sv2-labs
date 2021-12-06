package interfacestaticmethods.schoolchild;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void lowerClassChildTest() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(7);
        assertEquals(LowerClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void upperClassChildTest() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(12);
        assertEquals(UpperClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void wrongAgeTest() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(4));
        assertEquals("Age must be between 6-14", exception.getMessage());
    }
}