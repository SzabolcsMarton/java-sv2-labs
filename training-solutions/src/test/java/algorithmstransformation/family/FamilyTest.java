package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
     void init(){
         family = new Family();
         family.addFamilyMember(new FamilyMember("Toth Imre", 30));
         family.addFamilyMember(new FamilyMember("Toth Bela", 35));
         family.addFamilyMember(new FamilyMember("Toth Katalin", 42));
         family.addFamilyMember(new FamilyMember("Kovacs Imre", 40));
         family.addFamilyMember(new FamilyMember("Szabo Geza Imre", 28));
         family.addFamilyMember(new FamilyMember("Imre Imre", 20));
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        List<Integer> expected = family.getAgesOfFamilyMembersWithNameGiven("Imre");

        assertEquals(4, expected.size());
        assertTrue(expected.contains(30));
        assertFalse(expected.contains(60));
    }
}