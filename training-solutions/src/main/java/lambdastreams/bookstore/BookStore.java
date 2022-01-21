package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks(){
        if(books.isEmpty()){
            return 0;
        }
        return books
                .stream()
                .mapToInt(Book::getPieces)
                .sum();
    }

    public Optional<Book> findNewestBook() {
        return books
                .stream()
                .max(Comparator.comparingInt(Book::getYear));
    }

    public Integer getTotalValue() {
        return books
                .stream()
                .mapToInt(book -> (int) (book.getPieces() * book.getPrice()))
                .sum();
    }



    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
