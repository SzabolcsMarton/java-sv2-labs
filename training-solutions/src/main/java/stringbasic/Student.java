package stringbasic;

public class Student {

    private Person person;
    private String neptunNumber;
    private String educationIdentifier;
    private String idCardNumber;

    public Student(Person person, String neptunNumber, String educationIdentifier) {
        this.person = person;
        this.neptunNumber = neptunNumber;
        this.educationIdentifier = educationIdentifier;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunNumber() {
        return neptunNumber;
    }

    public void setNeptunNumber(String neptunNumber) {
        this.neptunNumber = neptunNumber;
    }

    public String getEducationIdentifier() {
        return educationIdentifier;
    }

    public void setEducationIdentifier(String educationIdentifier) {
        this.educationIdentifier = educationIdentifier;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }
}
