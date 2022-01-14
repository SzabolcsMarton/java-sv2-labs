package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> result = new TreeSet<>();
        for (Student actual : students){
            result.add(actual.getHight());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("a", 103));
        students.add(new Student("b", 106));
        students.add(new Student("c", 101));
        students.add(new Student("d", 107));
        students.add(new Student("e", 105));
        students.add(new Student("f", 102));
        students.add(new Student("g", 104));

        PhysicalEducation pe = new PhysicalEducation();
        System.out.println(pe.getOrderInLessons(students));
    }
}
