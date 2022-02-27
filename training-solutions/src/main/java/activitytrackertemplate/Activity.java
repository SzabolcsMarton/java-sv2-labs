package activitytrackertemplate;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    private long id;
    private final LocalDateTime startTime;
    private final String description;
    private final ActivityType activityType;
    private List<TrackPoint> trackPoints;

    public Activity(LocalDateTime startTime, String description, ActivityType activityType) {
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType activityType, List<TrackPoint> trackPoints) {
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType activityType) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType activityType, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
        this.trackPoints = trackPoints;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", activityType=" + activityType +
                '}';
    }
}
