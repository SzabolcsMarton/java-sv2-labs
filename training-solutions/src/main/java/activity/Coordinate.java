package activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        checkLatitudeIsValid(latitude);
        checkLongitudeIsValid(longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private void checkLatitudeIsValid(double latitude){
        if (latitude < -90 || latitude > 90){
            throw new IllegalArgumentException("Latitude is not valid");
        }
    }

    private void checkLongitudeIsValid(double longitude){
        if (longitude < -180 || longitude > 180){
            throw new IllegalArgumentException("Longitude is not valid");
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
