package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {

    private String nameOfTeacher;
    private String titleOfLesson;
    private LocalDateTime startsAt;

    public OnlineLesson(String nameOfTeacher, String titleOfLesson, LocalDateTime startsAt) {
        this.nameOfTeacher = nameOfTeacher;
        this.titleOfLesson = titleOfLesson;
        this.startsAt = startsAt;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getTitleOfLesson() {
        return titleOfLesson;
    }

    public LocalDateTime getStartsAt() {
        return startsAt;
    }
}
