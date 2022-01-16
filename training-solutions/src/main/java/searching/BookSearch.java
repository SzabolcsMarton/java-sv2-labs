package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if(validateString(author) || validateString(title)){
            throw new IllegalArgumentException("Author or title is not valid");
        }
        int index = Collections.binarySearch(books,new Book(title,author));
        if( index < 0) {
            throw new IllegalArgumentException("Can not find book");
        }
        return  books.get(index);
    }

    private boolean validateString(String stringToValidate){
        return  stringToValidate == null || stringToValidate.trim().length() == 0;
    }

    public List<Book> getBooks() {
        return books;
    }
}
