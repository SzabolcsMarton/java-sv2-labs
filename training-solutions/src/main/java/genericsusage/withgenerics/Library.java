package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Books is null");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Books is empty");
        }

        return books.get(0);

    }
}
