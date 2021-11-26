package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("You have to give te time of the Logging");
        }
        for (FieldPoint actual : fieldPointsToLog) {
            actual.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(actual);
        }
    }
}
