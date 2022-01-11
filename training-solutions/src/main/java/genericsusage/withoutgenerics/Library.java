package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List books){
        if (books == null) {
            throw new NullPointerException("Books is null");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Books is empty");
        }
        Object object = books.get(0);
        if(!(object instanceof Book)){
            throw new ClassCastException("Object is not a book");
        }
        return (Book) object;

    }
}
