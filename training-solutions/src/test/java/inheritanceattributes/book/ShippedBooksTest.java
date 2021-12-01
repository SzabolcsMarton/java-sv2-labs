package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBooksTest {

    @Test
    void createShippedBooksTest(){
        ShippedBooks shippedBooks = new ShippedBooks("Kryon tanitasai", 4000,1200);

        assertEquals("Kryon tanitasai", shippedBooks.getTitle());
        assertEquals(4000, shippedBooks.price);

    }

    @Test
    void orderTest(){
        ShippedBooks shippedBooks = new ShippedBooks("Kryon tanitasai", 4000,1200);

        assertEquals(9200, shippedBooks.order(2));
    }

    @Test
    void toStringTest(){
        ShippedBooks shippedBooks = new ShippedBooks("Kryon tanitasai", 4000,1200);

        assertEquals("Kryon tanitasai: 4000 Ft, postakoltseg: 1200 Ft",shippedBooks.toString());
    }

}