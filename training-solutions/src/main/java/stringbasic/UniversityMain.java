package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe",
                "john@gmail.com",
                "ins123",
                "ban123",
                "+36 1 1234 567");


        Student student = new Student(person, "nep123", "edu123");
        Student otherStudent = new Student(person, "nep456", "edu456");
        Student controllStudent = new  Student(person, "nep123", "edu123");
        student.setIdCardNumber("id123");

        System.out.println(student.getIdCardNumber());

        University university = new University();
        System.out.println(university.areEqual(student,otherStudent));
        System.out.println(university.areEqual(student, controllStudent));
        university.addStudent(student);
        university.addStudent(otherStudent);
        System.out.println(university.getStudents().size());
    }
}
