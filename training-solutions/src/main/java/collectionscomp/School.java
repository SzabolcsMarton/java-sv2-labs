package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("Ádám", 175));
        students.add(new Student("Éva", 165));
        students.add(new Student("Edit", 155));
        students.add(new Student("Sanyi", 145));
        students.add(new Student("Örs", 135));
        students.add(new Student("Géza", 125));

        System.out.println(students);

        Map<String, Integer> studentWithHeight = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

        for(Student actual : students){
            studentWithHeight.put(actual.getName(),actual.getHeight());
        }

        System.out.println(studentWithHeight);
    }
}
