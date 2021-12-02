package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    @Test
    void createTest(){
        Random random = new Random();
        AxeWarrior axeWarrior = new AxeWarrior(new Point(20, 30),random);

        assertEquals(100, axeWarrior.getHitPoint());
        assertTrue(axeWarrior.isAlive());
        assertEquals(20, axeWarrior.getPosition().getX());
        assertEquals(30, axeWarrior.getPosition().getY());
    }

    @Test
    void secondaryAttackTest(){
        Random random = new Random();
        Character one = new AxeWarrior(new Point(0, 0), random);
        Character two = new AxeWarrior(new Point(0, 0), random);
        one.secondaryAttack(two);

        assertEquals(100, one.getHitPoint());
        assertTrue(two.getHitPoint() >= 80);
    }

}