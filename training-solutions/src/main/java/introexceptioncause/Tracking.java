package introexceptioncause;


import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        List<String> coordinates = trackPoints.readCoordinates();
        List<Integer> altitudes = trackPoints.getAltitudes(coordinates);
        trackPoints.writeTheDistances(altitudes);
    }
}
