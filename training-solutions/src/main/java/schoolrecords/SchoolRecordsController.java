package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords classRecords = new ClassRecords("Fourth Grade A", new Random());
    private List<Tutor> tutors = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    public MarkType markType;

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.runMenu();

    }

    private void runMenu() {
        int option;
        do {
            printMenu();
            System.out.println("\nKérem válasszon a felsorolt menüpontokból, \nmajd nyomja meg az enter-t:");
            option = Integer.parseInt(scanner.nextLine());
            controll(option);
        } while (option != 11);
        System.out.println("\n Viszontlátásra!");
    }

    private void controll(int option) {

        switch (option) {
            case 1:
                System.out.println(classRecords.listStudentNames());
                System.out.println();
                break;

            case 2:
                System.out.println(classRecords.findStudentByName(getStudentFromUserInput().getName()).toString());
                System.out.println();
                break;

            case 3:
                System.out.println("Adja meg a nevet!");
                try {
                    classRecords.addStudent(new Student(scanner.nextLine()));
                    System.out.println("Diak sikeresen eltárolva");
                } catch (NullPointerException npe) {
                    throw new IllegalArgumentException("You must to give the name");
                }
                System.out.println();
                break;

            case 4:
                if (classRecords.removeStudent(classRecords.findStudentByName(getStudentFromUserInput().getName()))) {
                    System.out.println("Diák sikeresen törölve!");
                }
                System.out.println();
                break;

            case 5:
                Student randomStudent = classRecords.repetition();
                System.out.println("A felelő diák: " + randomStudent.getName());
                MarkType mtype = null;
                while(mtype == null) {
                    System.out.println("Adja meg az érdemjegyet:");
                    System.out.println("(1, 2, 3, 4, 5)");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    mtype = findMarkType(mark);
                }
                System.out.println("Adja meg a tanár nevét:");
                String tutorName = scanner.nextLine();
                System.out.println("Adja meg a tantárgy nevét:");
                String subjectName = scanner.nextLine();

                Mark markToAdd = new Mark(mtype, getSubjectFromList(subjectName), getTutorFromList(tutorName));
                randomStudent.grading(markToAdd);
                break;

            case 6:
                try {
                    double average = classRecords.calculateClassAverage();
                    System.out.println(average);
                } catch (ArithmeticException aie) {
                    throw new IllegalArgumentException("Can not calculate due to missing data", aie);
                }
                break;

            case 7:
                System.out.println("Adja meg a tantárgyat:");
                String subjectNameForAverage = scanner.nextLine();
                Subject subject = null;
                for (Subject actual : subjects) {
                    if (actual.getSubjectName().equals(subjectNameForAverage)) {
                        subject = actual;
                    }
                }
                try {
                    double averageBySubject = classRecords.calculateClassAverageBySubject(subject);
                    System.out.println(averageBySubject);
                } catch (NullPointerException npe) {
                    throw new IllegalArgumentException("Can not calculate average by subject, missing data", npe);
                }
                break;

            case 8:
                List<StudyResultByName> studyResults = classRecords.listStudyResults();
                for (StudyResultByName actual : studyResults) {
                    System.out.println(actual.toString());
                }
                break;

            case 9:
                try {
                    System.out.println(getStudentFromUserInput().calculateAverage());
                } catch (NullPointerException npe) {
                    throw new IllegalArgumentException("You need to provide the name", npe);
                }
                break;

            case 10:
                try {
                    Student student = classRecords.findStudentByName(getStudentFromUserInput().getName());
                    System.out.println(student.calculateSubjectAverage(getSubjectFromUserInput()));
                } catch (NullPointerException npe) {
                    throw new IllegalArgumentException("You must to give the name!", npe);
                }
                break;


        }

    }

    private MarkType findMarkType(int i)
    {
        for(MarkType actual : MarkType.values())
        {
            if(actual.getIntMarkType() == i)
                return actual;
        }

        return null;
    }

    private Subject getSubjectFromUserInput() {
        System.out.println("Adja meg a tantárgyat!");
        String subjectName = scanner.nextLine();
        Subject result = null;
        for (Subject actual : subjects) {
            if (actual.getSubjectName().equals(subjectName)) {
                result = actual;
            }
        }
        return result;
    }

    private Student getStudentFromUserInput() {
        System.out.println("Adja meg a diák nevét:");
        String name = scanner.nextLine();
        if (SchoolHelpers.isEmpty(name)) {
            throw new NullPointerException("Name con not be empty!");
        }
        return classRecords.findStudentByName(name);

    }


    private Subject getSubjectFromList(String subjectName) {
        Subject result = null;
        for (Subject actual : subjects) {
            if (actual.getSubjectName().equals(subjectName)) {
                result = actual;
            }
        }
        return result;
    }

    private Tutor getTutorFromList(String tutorName) {
        Tutor result = null;
        for (Tutor actual : tutors) {
            if (actual.getName().equals(tutorName)) {
                result = actual;
            }
        }
        return result;
    }


    public void printMenu() {
        System.out.println("Üdvözli az elektronikus osztálynapló alkalmazás");
        System.out.println();
        System.out.print("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés\n");
    }

    private void initSchool() {
        subjects.addAll(Arrays.asList(new Subject("földrajz"),
                new Subject("matematika"),
                new Subject("biológia"),
                new Subject("zene"),
                new Subject("fizika"),
                new Subject("kémia")));

        Tutor tutor = new Tutor("Nagy Csilla", subjects);
        tutors.add(tutor);

        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);
    }
}
