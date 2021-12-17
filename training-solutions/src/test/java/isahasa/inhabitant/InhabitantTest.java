package isahasa.inhabitant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InhabitantTest {

    @Test
    void createTest(){
        Inhabitant inhabitant = new Inhabitant("SanyiBacsi",new ParkingPlace(15));

        assertEquals("SanyiBacsi", inhabitant.getName());
        assertEquals(15, inhabitant.getParkingPlace().getNumber());
    }

    @Test
    void changeParkingPlaceTest(){
        ParkingPlace pp1 = new ParkingPlace(10);
        ParkingPlace pp2 = new ParkingPlace(15);
        Inhabitant inhabitant = new Inhabitant("Sanyi",pp1);

        assertEquals(10,inhabitant.getParkingPlace().getNumber());

        inhabitant.changeParkingPlace(15);

        assertEquals(15,inhabitant.getParkingPlace().getNumber());
    }

}