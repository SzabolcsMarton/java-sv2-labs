package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderStateTest {

    @Test
    void canDeleteOnNewTest() {
        OrderState state = OrderState.NEW;
        assertTrue(state.canDelete());
    }

    @Test
    void canDeleteOnConfirmedTest() {
        OrderState state = OrderState.CONFIRMED;
        assertTrue(state.canDelete());
    }

    @Test
    void canDeleteOnPreparedTest() {
        OrderState state = OrderState.PREPARED;
        assertTrue(state.canDelete());
    }

    @Test
    void canDeleteOnOnboardTest() {
        OrderState state = OrderState.ONBOARD;

        assertFalse(state.canDelete());
    }

    @Test
    void canDeleteOnDeliveredTest() {
        OrderState state = OrderState.DELIVERED;

        assertFalse(state.canDelete());
    }

    @Test
    void canDeleteOnReturnedTest() {
        OrderState state = OrderState.RETURNED;

        assertFalse(state.canDelete());
    }

    @Test
    void testCanDeleteOnDeleted() {
        OrderState state = OrderState.DELETED;

        assertFalse(state.canDelete());
    }
}