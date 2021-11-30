package dynamictypes.publictransport;

public class Metro extends PublickVehicle{

    private  int numberOfStations;

    public Metro(int lineNumber, double lenght, int numberOfStations) {
        super(lineNumber, lenght);
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}
