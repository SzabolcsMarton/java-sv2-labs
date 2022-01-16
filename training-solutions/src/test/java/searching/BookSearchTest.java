package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    List<Book> books = new ArrayList<>();

    @BeforeEach
    void setUp() {
        books.add(new Book("Acim", "Aszerzo"));
        books.add(new Book("Bcim", "Bszerzo"));
        books.add(new Book("Ccim", "Cszerzo"));
        books.add(new Book("Dcim", "Dszerzo"));
        books.add(new Book("Ecim", "Eszerzo"));

    }

    @Test
    void emptyParametersShouldThrowExceptionTest() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle("", ""));
        assertEquals("Author or title is not valid", ex.getMessage());
    }

    @Test
    void nullParametersShouldThrowExceptionTest() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle(null, null));
        assertEquals("Author or title is not valid", ex.getMessage());
    }

    @Test
    void bookNotExistsShouldThrowExceptionTest() {
        String author = "Xszerzo";
        String title = "Xcim";
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle(author, title));
        assertEquals("Can not find book", ex.getMessage());
    }

    @Test
    void findBookByAuthorTitle() {
        BookSearch bookSearchearch = new BookSearch(books);
        Book foundBook = bookSearchearch.findBookByAuthorTitle("Bszerzo", "Bcim");

        assertEquals("Bszerzo", foundBook.getAuthor());
        assertEquals("Bcim", foundBook.getTitle());

    }

}