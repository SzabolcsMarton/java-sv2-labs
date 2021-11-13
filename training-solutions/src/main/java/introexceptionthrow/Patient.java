package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;
    private int minYear = 1900;

    public Patient(String name, String ssn, int yearOfBirth) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Hibas nev! : " + name);
        }
        if( yearOfBirth <= minYear){
            throw new IllegalArgumentException("Hibas eletkor! :  " + yearOfBirth);
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
        Patient patient = new Patient("Sanyi Bacsi","12154",1980);
        System.out.println(patient.getName() + " " + patient.getYearOfBirth()+ " " + patient.getSocialSecurityNumber());
        //Patient otherPatient = new Patient("","12154",1960);
        //System.out.println(otherPatient.getName() + " " + otherPatient.getYearOfBirth() + " " + otherPatient.getSocialSecurityNumber());
        Patient morePatient = new Patient("Sanyi Bacsi","12154",1600);
        System.out.println(morePatient.getName() + " " + morePatient.getYearOfBirth() + " " + morePatient.getSocialSecurityNumber());
    }
}
