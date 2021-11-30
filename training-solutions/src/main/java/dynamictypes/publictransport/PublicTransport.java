package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {

    private List<PublickVehicle> vehiles = new ArrayList<>();

    public void addVehicle(PublickVehicle vehicle){
        vehiles.add(vehicle);
    }

    public List<PublickVehicle> getVehiles() {
        return vehiles;
    }
}
