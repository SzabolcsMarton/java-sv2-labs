package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    @Test
    void addNewPresent() {
        List<ChristmasPresent> presentsForTest = new ArrayList<>();
        presentsForTest.add(new ChristmasPresent("a", "Sanyi", 1000));
        presentsForTest.add(new ChristmasPresent("b", "Jozsi", 3000));
        presentsForTest.add(new ChristmasPresent("c", "Bela", 5000));
        presentsForTest.add(new ChristmasPresent("d", "Geza", 7000));
        ChristmasShopping shopping = new ChristmasShopping(presentsForTest);

        shopping.addNewPresent(new ChristmasPresent("e", "Pisti", 8000));

        assertEquals(5, shopping.getPresents().size());
        assertEquals("Pisti", shopping.getPresents().get(4).getName());

    }

    @Test
    void removeToExpensivePresentTest(){
        List<ChristmasPresent> presentsForTest = new ArrayList<>();
        presentsForTest.add(new ChristmasPresent("a", "Sanyi", 1000));
        presentsForTest.add(new ChristmasPresent("b", "Jozsi", 3000));
        presentsForTest.add(new ChristmasPresent("c", "Bela", 5000));
        presentsForTest.add(new ChristmasPresent("d", "Geza", 7000));
        ChristmasShopping shopping = new ChristmasShopping(presentsForTest);
        shopping.addNewPresent(new ChristmasPresent("e", "Pisti", 8000));

        shopping.removeToExpensivePresent(4000);

        assertEquals(2,shopping.getPresents().size());

    }


}