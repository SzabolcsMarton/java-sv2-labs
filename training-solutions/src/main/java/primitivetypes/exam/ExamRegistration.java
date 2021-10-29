package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    private LocalDate formatToLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {

        Exam exam = new Exam();
        Scanner scnr = new Scanner(System.in);
        ExamRegistration examRegistration = new ExamRegistration();

        System.out.println("Type in the name:");
        String name = scnr.nextLine();
        System.out.println("Year of Birth:");
        String yearOfBirt = scnr.nextLine();
        int yearOfBirthInt = Integer.parseInt(yearOfBirt);
        System.out.println("Month of Birth:");
        String monthOfBirth = scnr.nextLine();
        int monthOfBirthInt = Integer.parseInt(monthOfBirth);
        System.out.println("Day of Birth:");
        String dayOfBirth = scnr.nextLine();
        int dayOfBirthInt = Integer.parseInt(dayOfBirth);
        System.out.println("Zip Code:");
        String zipCode = scnr.nextLine();
        int zipCodeInt = Integer.parseInt(zipCode);
        System.out.println("Average points");
        String averagePoints = scnr.nextLine();
        double averagePointsDouble = Double.parseDouble(averagePoints);

        LocalDate dateOfBirth = LocalDate.of(yearOfBirthInt, monthOfBirthInt, dayOfBirthInt);

        Person personToExam = new Person(name,dateOfBirth,zipCodeInt, averagePointsDouble);
        exam.addPerson(personToExam);

        System.out.println(exam.getPersonsRegistered());

    }
}
