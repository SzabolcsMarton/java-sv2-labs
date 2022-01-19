package streams;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class Read {

    private List<Book> books = new ArrayList<>();

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages){
        return  books.stream()
                .filter((book -> book.getNumberOfPages() < maxNumberOfPages))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public List<String> listAuthors(){
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
