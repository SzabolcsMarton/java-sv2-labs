package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {

        Book kryon = new Book( "Lee Carroll", "Kryon");

        kryon.register("001");

        System.out.println("Author: " + kryon.getAuthor());
        System.out.println("Title: " + kryon.getTitle());
        System.out.println("Reg.Num. : " + kryon.getRegistrationNumber());
    }
}
