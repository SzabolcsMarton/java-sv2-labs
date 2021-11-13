package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;
    private int minYear = 1900;

    public Patient(String name, String ssn, int yearOfBirth) {
        SsnValidator ssnValidator = new SsnValidator();
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hibas nev! : " + name);
        }
        if (yearOfBirth <= minYear) {
            throw new IllegalArgumentException("Hibas eletkor! :  " + yearOfBirth);
        }
        if (!ssnValidator.isValidSsn(ssn)) {
            throw new IllegalArgumentException("Hibas Taj-szam! : " + ssn);
        }
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.socialSecurityNumber = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
//        Patient patientOne = new Patient("Sanyi Bacsi", "123456788", 1980);
//        System.out.println(patientOne.getName());
//        System.out.println(patientOne.getSocialSecurityNumber());
//        System.out.println(patientOne.getYearOfBirth());
//
//        Patient patientTwo = new Patient("", "123456788", 1980);
//        System.out.println(patientTwo.getName());
//        System.out.println(patientTwo.getSocialSecurityNumber());
//        System.out.println(patientTwo.getYearOfBirth());
//
//        Patient thirdPatient = new Patient("Sanyi Bacsi", "123456789", 1980);
//        System.out.println(thirdPatient.getName());
//        System.out.println(thirdPatient.getSocialSecurityNumber());
//        System.out.println(thirdPatient.getYearOfBirth());
//
        Patient fourthPatient = new Patient("Sanyi Bacsi", "123456788", 1600);
        System.out.println(fourthPatient.getName());
        System.out.println(fourthPatient.getSocialSecurityNumber());
        System.out.println(fourthPatient.getYearOfBirth());
    }

}

