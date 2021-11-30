package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void addVehicleTest(){
        PublicTransport publicTransport = new PublicTransport();
        PublickVehicle publickVehicleBus = new Bus(134,22.5, "Ikarus");
        PublickVehicle publickVehicleTram = new Tram(19,40.0,1);
        PublickVehicle publickVehicleMetro = new Metro(2,50,12);
        publicTransport.addVehicle(publickVehicleBus);
        publicTransport.addVehicle(publickVehicleTram);
        publicTransport.addVehicle(publickVehicleMetro);

        assertEquals(3,publicTransport.getVehiles().size());


    }

}