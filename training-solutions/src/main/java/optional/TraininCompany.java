package optional;

import java.util.List;
import java.util.Optional;

public class TraininCompany {

    private List<Course> courses;

    public TraininCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> result = Optional.empty();
        for (Course actual : courses) {
            if (actual.getPrice() < maxPrice) {
                result = Optional.of(actual);
            }
        }

        return result.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> result = Optional.empty();
        int resultPrice = 0;
        for (Course actual : courses) {
            if(actual.getCourseName().equals(name) && actual.getLevel().equals(level)) {
                result = Optional.of(actual);
            }
        }

        return result.orElseThrow(()-> new IllegalArgumentException("No such course.")).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level){
        Optional<String > result = Optional.empty();
        for (Course actual : courses){
            if(actual.getLevel().equals(level)){
                result = Optional.of(actual.getCourseName());
            }
        }

        return result.orElse("Sorry, there is no course at this level.");
    }



    public List<Course> getCourses() {
        return courses;
    }
}
