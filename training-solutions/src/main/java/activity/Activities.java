package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        return (int) activities
                .stream()
                .filter(activity -> activity.getClass() == ActivityWithTrack.class)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities
                .stream()
                .filter(activity -> activity.getClass() == ActivityWithoutTrack.class)
                .count();
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (ActivityType actual : ActivityType.values()) {
            double sum = activities
                    .stream()
                    .filter(activity -> activity.getType() == actual)
                    .mapToDouble(Activity::getDistance).sum();
            reports.add(new Report(actual, sum));
        }

        return reports;
    }

    public List<Activity> getActivities() {
        return new ArrayList<>(activities);
    }
}
