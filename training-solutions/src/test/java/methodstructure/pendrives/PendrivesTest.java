package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    List<Pendrive> pendrivesList = Arrays.asList(new Pendrive("A", 64,5000),
            new Pendrive("B", 64,6000), new Pendrive("C",64, 7000));

    @Test
    void getBestTest() {
        Pendrives pendrives = new Pendrives();

        assertEquals(pendrivesList.get(0),pendrives.getBest(pendrivesList));
    }

    @Test
    void getCheapestTest(){
        Pendrives pendrives = new Pendrives();

        assertEquals(pendrivesList.get(0), pendrives.getCheapest(pendrivesList));
    }

    @Test
    void risePriceWhereCapacityTest(){
        Pendrives pendrives = new Pendrives();

        pendrives.risePriceWhereCapacity(pendrivesList,10,64);

        assertEquals(6600, pendrivesList.get(1).getPrice());
        assertEquals(7700, pendrivesList.get(2).getPrice());
    }


}