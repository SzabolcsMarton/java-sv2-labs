package dynamictypes.publictransport;

public class Tram extends  PublickVehicle{

    private int numberOfTamcars;

    public Tram(int lineNumber, double lenght, int numberOfTamcars) {
        super(lineNumber, lenght);
        this.numberOfTamcars = numberOfTamcars;
    }

    public int getNumberOfTamcars() {
        return numberOfTamcars;
    }
}
