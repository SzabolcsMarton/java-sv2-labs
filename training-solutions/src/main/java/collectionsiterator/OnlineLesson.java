package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {

    private final String nameOfTeacher;
    private final String titleOfLesson;
    private final LocalDateTime startsAt;

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
