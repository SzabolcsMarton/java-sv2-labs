package dynamictypes.publictransport;

import dynamictypes.school.School;

public class Bus extends PublickVehicle{

   private String brand;

    public Bus(int lineNumber, double lenght, String brand) {
        super(lineNumber, lenght);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
