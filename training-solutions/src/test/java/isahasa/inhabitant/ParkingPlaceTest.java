package isahasa.inhabitant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingPlaceTest {

    @Test
    void createTest(){
        ParkingPlace place = new ParkingPlace(11);
        assertEquals(11, place.getNumber());
    }

}