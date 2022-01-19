package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

    Read read = new Read();

    @BeforeEach
    void init(){
        read.addBook(new Book("a","a1",100));
        read.addBook(new Book("b","bb1",150));
        read.addBook(new Book("c","ccc1",200));
        read.addBook(new Book("a","aa2",170));
        read.addBook(new Book("b","bb2",210));
    }

    @Test
    void listBookTitlesShorterThanGivenTest() {
        List<String > test = read.listBookTitlesShorterThanGiven(160);

        assertEquals(2,test.size());
        assertEquals("a1", test.get(0));

    }

    @Test
    void listBookTitlesWithGivenAuthorTest() {
        List<String> test = read.listBookTitlesWithGivenAuthor("b");

        assertEquals(2,test.size());
        assertEquals("bb2",test.get(1));
    }

    @Test
    void listAuthorsTest() {
        List<String> test = read.listAuthors();

        assertEquals(3, test.size());
        assertTrue(test.contains("a"));
        assertTrue(test.contains("b"));
        assertTrue(test.contains("c"));
        assertFalse(test.contains("x"));
    }
}