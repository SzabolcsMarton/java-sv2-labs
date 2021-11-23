package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistry;
    private final String regNumber;

    public Monument(String name, String address, LocalDate dateOfRegistry, String regNumber) {
        if(isEmpty(name) || isEmpty(address) || isEmpty(regNumber)){
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        this.name = name;
        this.address = address;
        this.dateOfRegistry = dateOfRegistry;
        this.regNumber = regNumber;
    }

    private boolean isEmpty(String text){
        return text == null || text.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
