package inheritencemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void createBigBossTest(){
        BigBoss bigBoss = new BigBoss("Big Boss","Budapest I. ker",
                300_000,5,100_000);
        assertEquals("Big Boss", bigBoss.getName());
        assertEquals("Budapest I. ker", bigBoss.getAddress());
        assertEquals(5,bigBoss.getNumberOfEmployee());
        assertEquals(100000, bigBoss.getBonus());
        assertEquals(550_000, bigBoss.getSalary());
    }

}