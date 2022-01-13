package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String nameOfCompany;
    private String taxNumber;

    public Company(String nameOfCompany, String taxNumber) {
        this.nameOfCompany = nameOfCompany;
        this.taxNumber = taxNumber;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return nameOfCompany.equals(company.nameOfCompany) && taxNumber.equals(company.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, taxNumber);
    }
}
