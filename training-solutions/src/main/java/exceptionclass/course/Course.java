package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        validate(name, begin);
        this.name = name;
        this.begin = begin;
    }

    private void validate(String name, SimpleTime simpleTime){
        if(name == null){
            throw new IllegalArgumentException("Name is null");
        }
        if (simpleTime == null){
            throw new IllegalArgumentException("Begin is null");
        }
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d: %s", begin.getHour(), begin.getMinute(), this.name);
    }
}
