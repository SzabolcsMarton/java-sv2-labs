package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessons = new ArrayList<>();

    public void addNewLesson(OnlineLesson lesson){
        int index = 0;
        for (int i = 0; i < lessons.size() - 1; i++) {
            LocalDateTime lessonStartAt = lessons.get(i).getStartsAt();
            LocalDateTime nextLessonStartAt = lessons.get(i + 1).getStartsAt();
            if (lessonStartAt.isBefore(lesson.getStartsAt()) && nextLessonStartAt.isAfter(lesson.getStartsAt())) {
                index = i + 1;
            }
        }
        lessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> onlineLessonIterator= lessons.iterator();
        while (onlineLessonIterator.hasNext()) {
            OnlineLesson lesson = onlineLessonIterator.next();
            if(title.equals(lesson.getTitleOfLesson())){
                result.add(lesson);
            }
        }
        return result;
    }


    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void removeLesson(LocalDateTime startTime){
        Iterator<OnlineLesson> onlineLessonIterator= lessons.iterator();
        while (onlineLessonIterator.hasNext()) {
            OnlineLesson lesson = onlineLessonIterator.next();
            if(lesson.getStartsAt().equals(startTime)){
               onlineLessonIterator.remove();
            }
        }
    }

}
