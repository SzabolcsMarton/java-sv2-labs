package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

        return (max.getLatitude() - min.getLatitude()) * (max.getLongitude() - min.getLongitude());
    }

    public void loadFromGpx(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String line;
            Coordinate coordinate = null;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    double lat = Double.parseDouble(line.substring(15, 25));
                    double lon = Double.parseDouble(line.substring(32, 42));
                    coordinate = new Coordinate(lat,lon);
                }
                if (line.trim().startsWith("<ele>")) {
                    double elevation = Double.parseDouble(line.substring(9, 14));
                    trackPoints.add(new TrackPoint(coordinate,elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file");
        }
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }


}
