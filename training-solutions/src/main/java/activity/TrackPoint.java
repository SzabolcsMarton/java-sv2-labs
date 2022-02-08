package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint trackPoint) {
        double lt1 = this.getCoordinate().getLatitude();
        double ln1 = this.getCoordinate().getLongitude();
        double lt2 = trackPoint.getCoordinate().getLatitude();
        double ln2 = trackPoint.getCoordinate().getLongitude();
        double el1 = this.getElevation();
        double el2 = trackPoint.getElevation();
        return CalculateDistance.distance(lt1, lt2, ln1, ln2, el1, el2);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}
