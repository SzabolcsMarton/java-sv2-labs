package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kryon");

        System.out.println(book.getTitle());
        book.setTitle("Kryon II");
        System.out.println(book.getTitle());

    }
}
