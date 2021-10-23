package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).length() <= 10) {
                group1.add(students.get(i));
                System.out.println(students.get(i) + "a group1-be kerult!");
            }else {
                group2.add(students.get(i));
                System.out.println(students.get(i) + "a group2-be kerult");
            }
        }
        System.out.println(group1);
        System.out.println(group2);
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList(Arrays.asList("John Doe", "Toth Emerencia", "Nagy Laszlo", "Kiss Ida", "Humbold Kalmar"));
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);

    }
}
