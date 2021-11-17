package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books books = new Books();

    @TempDir
    File tempFolder;

    @Test
    void writeBooksTest() throws IOException {
        Path path = tempFolder.toPath().resolve("books.txt");
        books.WriteFormatedBookList(path);
        List<String> testResult = Files.readAllLines(path);

        assertEquals(4,testResult.size());
        assertEquals("Gárdonyi Géza: Egri csillagok",testResult.get(0));
    }

}