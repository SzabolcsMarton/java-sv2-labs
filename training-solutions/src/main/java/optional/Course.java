package optional;

public class Course {

    private String courseName;
    private int price;
    private Level level;

    public Course(String courseName, int price, Level level) {
        this.courseName = courseName;
        this.price = price;
        this.level = level;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }
}
