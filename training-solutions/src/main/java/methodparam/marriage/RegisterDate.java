package methodparam.marriage;

import java.time.LocalDate;

public class RegisterDate {
    private String descrirption;
    private LocalDate date;

    public RegisterDate(String descrirption, LocalDate date) {
        this.descrirption = descrirption;
        this.date = date;
    }

    public String getDescrirption() {
        return descrirption;
    }

    public LocalDate getDate() {
        return date;
    }
}
