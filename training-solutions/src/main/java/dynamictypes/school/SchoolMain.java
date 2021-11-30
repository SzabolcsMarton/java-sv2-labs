package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School("iskola", 16);
        School otherSchool = new PrimarySchool("altalanos", 8);
        School anotherSchool = new SecondarySchool("kozep", 4);

        System.out.println(school);
        System.out.println(otherSchool);
        System.out.println(anotherSchool);
    }
}
//School statikus tipus mellett a dinamikus tipussal peldanyositott attrributum ertekek lettek beallitva.