package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add((title));
    }

    public  void findBookAndSetAuthor(String title, String author) {
        if(titles.contains(title)) {
            int indexOfTitles = titles.indexOf(title);
            titles.set(indexOfTitles,  author +":" + titles.get(indexOfTitles) );
        }
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {

        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hom many books title do you store int he list? : ");
        int numberOfBookTitles = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type in the titles one by one, following each with enter button!");
        for (int i = 0; i < numberOfBookTitles; i++) {
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println(books.getTitles());
        System.out.println("To which title do you want to add the Author?");
        String titleToSetAuthor = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();


        books.findBookAndSetAuthor(titleToSetAuthor,author);
        System.out.println(books.getTitles());

    }
}
