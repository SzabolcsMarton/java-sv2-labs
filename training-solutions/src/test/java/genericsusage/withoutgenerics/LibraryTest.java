package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void getFirstBookWithNullShouldThrowException(){
        List books = null;
        Library library = new Library();

        Exception exception = assertThrows(NullPointerException.class,
                ()-> library.getFirstBook(books));
        assertEquals("Books is null", exception.getMessage());
    }

    @Test
    void getFirstBookWithEmptyListShouldThrowException(){
        List books = new ArrayList<>();
        Library library = new Library();

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> library.getFirstBook(books));
        assertEquals("Books is empty", exception.getMessage());
    }

    @Test
    void GetFirstBookWithDifferentObjectSholdThrowException(){
        List books = new ArrayList<>();
        books.add(new Object());
        Library library = new Library();

        Exception exception = assertThrows(ClassCastException.class,
                ()-> library.getFirstBook(books));
        assertEquals("Object is not an instance of a book", exception.getMessage());


    }

    @Test
    void getFirstBookShouldReturnTheBook(){
        List books = new ArrayList<>();
        books.add(new Book("Egy konyvecske"));
        Library library = new Library();
        String expected = "Egy konyvecske";

        assertEquals(expected, library.getFirstBook(books).getTitle());

    }
}