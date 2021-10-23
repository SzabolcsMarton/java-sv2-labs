package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jack Doen");
        Student student3 = new Student("Eddie Murphy");
        Student student4 = new Student("John Rambo");
        Student student5 = new Student("lee Wang");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students.size());

        student1.setActive(false);
        student3.setActive(false);
        student5.setActive(false);

        List<Student> deleteStudents = new ArrayList<>();
        for(Student student: students) {
            if(!student.isActive()) {
                deleteStudents.add(student);
            }
        }
        students.removeAll(deleteStudents);
        System.out.println(students.size());
    }
}
