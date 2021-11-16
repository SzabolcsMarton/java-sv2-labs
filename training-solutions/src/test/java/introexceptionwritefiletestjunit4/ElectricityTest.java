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

public class ElectricityTest {

    private Electricity electricity = new Electricity();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void testWriteFile() throws IOException {
        Path path = temp.newFile("streets.txt").toPath();
        electricity.writeStreets(path);

        List<String> tempStreets = Files.readAllLines(path);
        assertEquals(electricity.createListOfStreets(),tempStreets);
        assertEquals("Fo utca", tempStreets.get(2));
    }

}