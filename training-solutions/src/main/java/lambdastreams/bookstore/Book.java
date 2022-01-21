package lambdastreams.bookstore;

public class Book {

    private String title;
    private int year;
    private double price;
    private int pieces;

    public Book(String title, int year, double price, int pieces) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.pieces = pieces;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }
}
