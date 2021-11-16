package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {
    private Books books = new Books();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void testWriteNames() throws IOException {
        Path path = temp.newFile("books.txt").toPath();
        books.WriteFormatedBookList(path);

        List<String> books = Files.readAllLines(path);

        assertEquals(4, books.size());
        assertEquals("Fekete István: Tüskevár", books.get(2));
    }



}