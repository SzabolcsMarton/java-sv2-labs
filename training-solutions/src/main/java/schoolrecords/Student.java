package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        checkNameIsEmpty(name);
        this.name = name;
    }

    private void checkNameIsEmpty(String name){
        if(SchoolHelpers.isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    public void grading(Mark mark) {
        SchoolHelpers.ensureNotNull(mark, "Mark");
        marks.add(mark);
    }

    public double calculateAverage() {
        double sum = 0.0;
        if(marks.isEmpty()){
            return 0.0;
        }
        for(Mark actual : marks){
            sum += actual.getMarkType().getIntMarkType();
        }
        return SchoolHelpers.calculateAverage(sum, marks.size());

    }

    public double calculateSubjectAverage(Subject subject) {
        SchoolHelpers.ensureNotNull(subject, "Subject");
        double subjectMarksSum = 0.0;
        int subjectCounter = 0;
        for(Mark actual : marks){
            if(actual.getSubject().getSubjectName().equals(subject.getSubjectName())){
               subjectMarksSum += actual.getMarkType().getIntMarkType();
               subjectCounter++;
            }
        }
        if(subjectCounter == 0 || subjectMarksSum == 0.0){
            return 0.0;
        }
        return SchoolHelpers.calculateAverage(subjectMarksSum, subjectCounter);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(name + " marks: ");
        for(Mark actual : marks){
            sb.append(actual.getSubject().getSubjectName()).append(": ").append(actual);
        }
        return sb.toString();
     }
}
