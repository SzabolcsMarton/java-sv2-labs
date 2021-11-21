package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void createFamilyMemberTest() {
        FamilyMember familyMember = new FamilyMember("John Doe", 45);

        assertEquals("John Doe", familyMember.getName());
        assertEquals(45, familyMember.getAge());
    }

}