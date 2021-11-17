package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File tempFolder;

    @Test
    void writeStreetsTest() throws IOException {
        Path path = tempFolder.toPath().resolve("streets.txt");
        electricity.writeStreets(path);
        List<String> test = Files.readAllLines(path);

        assertEquals(6,test.size());
        assertEquals("Rákóczi utca", test.get(3));
    }

}