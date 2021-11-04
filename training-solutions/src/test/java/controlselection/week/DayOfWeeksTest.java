package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void testDaysAndParts(){
        assertEquals("hét eleje", new DayOfWeeks().partsOfTheWeek("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().partsOfTheWeek("kedd"));
        assertEquals("hét közepe", new DayOfWeeks().partsOfTheWeek("csütörtök"));
        assertEquals("majdnem hétvége", new DayOfWeeks().partsOfTheWeek("péntek"));
        assertEquals("hét vége", new DayOfWeeks().partsOfTheWeek("szombat"));
    }

    @Test
    void testCaseSensitivity(){
        assertEquals("hét közepe", new DayOfWeeks().partsOfTheWeek("keDD"));
    }

    @Test
    void testIllegal(){
        assertEquals("ismeretlen nap", new DayOfWeeks().partsOfTheWeek("november"));
    }

}