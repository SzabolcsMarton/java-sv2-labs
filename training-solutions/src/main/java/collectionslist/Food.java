package collectionslist;

import java.time.LocalDate;

public class Food {

    private String name;
    private LocalDate expiryDate;

    public Food(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
