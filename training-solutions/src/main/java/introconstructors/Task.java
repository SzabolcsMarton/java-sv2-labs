package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private  int duration;

    // javac utan a class-ban van constructor , ures.

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    //ujraforditas utan 1 constructor van benne ami a title es descp. attributumot inicializalja
    public static void main(String[] args) {
        Task task = new Task("Cook lunch", "Have to go to cook something for lunch otherwise I`ll die");
        task.setDuration(35);
        task.start();
        System.out.println("title: " + task.getTitle());
        System.out.println("desc.: " + task.getDescription());
        System.out.println("duration: " + task.getDuration());
        System.out.println("start: " + task.getStartDateTime());
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
