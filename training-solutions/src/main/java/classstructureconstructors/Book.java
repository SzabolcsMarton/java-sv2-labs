package classstructureconstructors;

public class Book {
    private String author;
    private String title;
    private String registrationNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public  void register(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

}
