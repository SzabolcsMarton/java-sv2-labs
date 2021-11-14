package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TankTest {

    Tank tank = new Tank();

    @Test
     public void testGetAngle() {
        tank.modifyAngle(60);
        tank.modifyAngle(-40);

        assertEquals(20, tank.getAngle());
    }

    @Test
    public void testGetAngleWithIncorrectData(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(180));
        assertEquals("A csővet nem lehet 80 foknál jobban elforditani semelyik irányba!",exception.getMessage());
    }



}