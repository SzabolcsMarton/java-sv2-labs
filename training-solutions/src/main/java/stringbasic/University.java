package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean areEqual(Student student, Student otherStudent){
        return   (student.getEducationIdentifier().equals(otherStudent.getEducationIdentifier() ) ) &&
                 (student.getNeptunNumber().equals(otherStudent.getNeptunNumber() ) );
    }

}
