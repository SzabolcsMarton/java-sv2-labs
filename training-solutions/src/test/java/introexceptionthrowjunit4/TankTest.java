package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    private Tank tank = new Tank();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testGetAngle() {
        tank.modifyAngle(60);
        tank.modifyAngle(-40);

        assertEquals(20, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAngleSimpleExpection() {
        tank.modifyAngle(95);
    }

    @Test
    public void testGetAngleExpectedExpection() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("A csővet nem lehet 80 foknál jobban elforditani semelyik irányba!");
        tank.modifyAngle(90);
    }

    @Test
    public void testGetAngleAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(90));
        assertEquals("A csővet nem lehet 80 foknál jobban elforditani semelyik irányba!", exception.getMessage());
    }
}