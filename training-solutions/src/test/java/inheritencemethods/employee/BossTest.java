package inheritencemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void createBossTest(){
        Boss boss = new Boss("The Boss", "Budapest", 300_000,5);

        assertEquals("The Boss", boss.getName());
        assertEquals("Budapest", boss.getAddress());
        assertEquals(5, boss.getNumberOfEmployees());
        assertEquals(450_000, boss.getSalary());
    }

}