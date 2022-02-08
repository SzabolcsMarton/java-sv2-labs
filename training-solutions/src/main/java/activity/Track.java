package activity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        double elevation = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() > trackPoints.get(i).getElevation()) {
                elevation += trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }

        return elevation;
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));
        }

        return sum;
    }

    public double getFullDecrease() {
        double decrease = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i + 1).getElevation() < trackPoints.get(i).getElevation()) {
                decrease += trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }

        return Math.abs(decrease);
    }

    public Coordinate findMinimumCoordinate() {
        double minLat = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .min(Comparator.comparing(Coordinate::getLatitude))
                .orElseThrow(() -> new IllegalStateException("No trackpoints"))
                .getLatitude();
        double minLon = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .min(Comparator.comparing(Coordinate::getLongitude))
                .orElseThrow(() -> new IllegalStateException("No trackpoints"))
                .getLongitude();

        return new Coordinate(minLat, minLon);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLat = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .max(Comparator.comparing(Coordinate::getLatitude))
                .orElseThrow(() -> new IllegalStateException("No trackpoints"))
                .getLatitude();
        double maxLon = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .max(Comparator.comparing(Coordinate::getLongitude))
                .orElseThrow(() -> new IllegalStateException("No trackpoints"))
                .getLongitude();

        return new Coordinate(maxLat, maxLon);
    }

    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();
        return (max.getLatitude()-min.getLatitude()) * (max.getLongitude() - min.getLongitude());
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

}
