package activitytracker;

import activity.ActivityType;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String description;
    private Type type;
    private List<TrackPoint> trackpoints;

    public Activity(LocalDateTime startTime, String description, Type type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(long id, LocalDateTime startTime, String desc,Type type) {
        this(startTime, desc, type);
        this.id = id;
    }

    public Activity(LocalDateTime startTime, String desc, Type type, List<TrackPoint> trackpoints) {
        this(startTime, desc, type);
        this.trackpoints = trackpoints;
    }

    public Activity(long id, LocalDateTime startTime, String description, Type type, List<TrackPoint> trackpoints) {
        this(id, startTime, description, type);
        this.trackpoints = trackpoints;
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

    public Type getType() {
        return type;
    }

    public List<TrackPoint> getTrackpoints() {
        return trackpoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + description + '\'' +
                ", type=" + type +
                ", trackpoints=" + trackpoints +
                '}';
    }
}
