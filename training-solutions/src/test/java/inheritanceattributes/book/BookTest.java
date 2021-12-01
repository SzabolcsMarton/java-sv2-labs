package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createBookTest() {
        Book book = new Book("Kryon tanitasai", 4000);


        assertEquals("Kryon tanitasai", book.getTitle());
        assertEquals(4000, book.price);
    }

    @Test
    void purchaseTest() {
        Book book = new Book("Kryon tanitasai", 4000);

        assertEquals(8000, book.purchase(2));
    }

}