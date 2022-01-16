package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty>{

    private String idNumber;
    private String description;
    private LocalDate registrationDate;

    public LostProperty(String idNumber, String description, LocalDate registrationDate) {
        this.idNumber = idNumber;
        this.description = description;
        this.registrationDate = registrationDate;
    }

    public LostProperty(String description, LocalDate registrationDate) {
        this.description = description;
        this.registrationDate = registrationDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return description.equals(that.description) && registrationDate.equals(that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, registrationDate);
    }

    @Override
    public int compareTo(LostProperty property) {
        if(this.description.compareTo(property.getDescription()) == 0) {
            return this.registrationDate.compareTo(property.getRegistrationDate());
        }else {
            return this.description.compareTo(property.getDescription());
        }
    }
}
