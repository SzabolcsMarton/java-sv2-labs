package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
        public String getFullname(String firstname, String lastname) {
            return firstname + " " + lastname;
        }
        public LocalDate getFullDate(int year, int month, int day){
            return LocalDate.of(year, month, day);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Registration registration = new Registration();

            System.out.println("Firstname: ");
            String firtsname = scanner.nextLine();
            System.out.println("Lastname:");
            String lastname = scanner.nextLine();

            System.out.println("Year of Birth:");
            int year = scanner.nextInt();
            System.out.println("Month of Birth");
            int month = scanner.nextInt();
            System.out.println("Day of Birth:");
            int day = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Email:");
            String email = scanner.nextLine();
            System.out.println();
            Person person = new Person(registration.getFullname(firtsname, lastname),registration.getFullDate(year , month, day), email);

            System.out.println(person.toString());
        }

}
