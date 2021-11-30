package dynamictypes.publictransport;

public class PublickVehicle {
    private int lineNumber;
    private double lenght;

    public PublickVehicle(int lineNumber, double lenght) {
        this.lineNumber = lineNumber;
        this.lenght = lenght;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLenght() {
        return lenght;
    }
}
