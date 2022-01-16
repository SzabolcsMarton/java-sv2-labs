package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;
    private String tajNumber;
    private LocalDateTime scheduledTime;

    public Patient(String name, String tajNumber, LocalDateTime scheduledTime) {
        this.name = name;
        this.tajNumber = tajNumber;
        this.scheduledTime = scheduledTime;
    }



    public String getName() {
        return name;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }
}
