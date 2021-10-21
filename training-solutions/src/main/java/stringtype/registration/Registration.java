package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password1 = scanner.nextLine();
        System.out.println("Password again:");
        String password2 = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();

        UserValidator validator = new UserValidator();
        System.out.println("Username valid : " + validator.isValidUsername(username));
        System.out.println("Password valid : " + validator.isValidPassword(password1,password2));
        System.out.println("Email valid :"+ validator.isValidEmail(email));
    }
}
