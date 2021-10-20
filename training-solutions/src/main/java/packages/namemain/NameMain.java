package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import  packages.lastname.LastName;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("John");
        LastName lastName = new LastName("Doe");
        String name = prefix.getPre() + " " +  firstName.getFirstName() + " " + lastName.getLastName();
        System.out.println(name);
    }
}
