package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Year of Birth:");
        int year = scanner.nextInt();
        System.out.println("Month of Birth: ");
        int month = scanner.nextInt();
        System.out.println("Day of Birth:");
        int day = scanner.nextInt();

        Employee newEmployee = new Employee("John Doe",1980,10,11);

        System.out.println("Name: "+ newEmployee.getName() + "\n" +
                "D.O.B.: " + newEmployee.getDateOfBirth() + "\n" +
                "Begin employment: " + newEmployee.getBeginEmployment());

        newEmployee.setName("Jane Doe");
        System.out.println(newEmployee.getName());
    }
}
