package schoolrecords;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private final List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        SchoolHelpers.ensureNotNull(student,"Student");
        if(findStudentByNameInternal(student.getName()) != null) {
            return false;
        }
        students.add(student);
        return true;
    }

    public String getClassName() {
        return className;
    }

    public boolean removeStudent(Student student) {
        SchoolHelpers.ensureNotNull(student,"Student");
        Student foundStudent = findStudentByNameInternal(student.getName());
        if(foundStudent == null) {
            return false;
        }
        students.remove(foundStudent);
        return true;
    }

    public Student findStudentByName(String name) {
        if(students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        Student found = findStudentByNameInternal(name);
        if(found == null){
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return found;
    }

    private Student findStudentByNameInternal(String name) {
        if(SchoolHelpers.isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        for (Student actual : students) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    public double calculateClassAverage() {
        if(students.isEmpty()){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double classSum = 0.0;
        for (Student actual : students){
            double actualAverage = actual.calculateAverage();
            if(actualAverage == 0.0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            classSum += actualAverage;
        }
        return SchoolHelpers.calculateAverage(classSum, students.size());
    }

    public Student repetition() {
        if(students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int randomIndex = random.nextInt(0,students.size());
        return students.get(randomIndex);
    }

    public double calculateClassAverageBySubject(Subject subject) {
        SchoolHelpers.ensureNotNull(subject, "Subject");
        int studentCount = 0;
        double sum = 0.0;
        for (Student actual : students){
            double actualSubjectAverage = actual.calculateSubjectAverage(subject);
            if(actualSubjectAverage != 0.0){
                sum += actualSubjectAverage;
                studentCount++;
            }
        }
        return SchoolHelpers.calculateAverage(sum, studentCount);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student actual : students){
            result.add(new StudyResultByName(actual.getName(), actual.calculateAverage()));
        }
        return result;
    }


    public String listStudentNames() {
        StringBuilder studentNamesBuilder = new StringBuilder();
        for (Student actual : students) {
            if (!studentNamesBuilder.isEmpty()){
                studentNamesBuilder.append(", ");
            }
            studentNamesBuilder.append(actual.getName());
        }
        return studentNamesBuilder.toString();
    }
}
