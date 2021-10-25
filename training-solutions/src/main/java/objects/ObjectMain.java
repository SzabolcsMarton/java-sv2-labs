package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMain {
    public static void main(String[] args) {
//        new Book(); // megtenni meg tudom de elerni kesobb mar nem
//        System.out.println(new Book()); // a memoria cimet irja ki mint referenciat
//        Book emptyBook;
//        // System.out.println(emptyBook);    nem lehet nincs inicializalva
//        emptyBook = null;
//        System.out.println(emptyBook);
//        System.out.println(emptyBook == null);
//        Book book = new Book();
//        System.out.println(book);
//        book = null;
//        book = new Book();
//        System.out.println(book);
//        Book anotherBook = new Book();
//        System.out.println(book == anotherBook);
//        anotherBook = book;
//        System.out.println(anotherBook == book);

        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> books1 = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> books2= new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());

        System.out.println(books);
        System.out.println(books1);
        System.out.println(books2);

    }
}
