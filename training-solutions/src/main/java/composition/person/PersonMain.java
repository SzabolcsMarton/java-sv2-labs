package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Sanyi Bacsi", "xy-x64313");
        Address address = new Address("Hungary", "Budapest", "Joska utca 8.", "1035");
        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());
        System.out.println(person.getAddress().getCity());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Sanyi Bacsi", " xx-y2548");
        System.out.println(person.personToString());
        person.getAddress().correctData("Magyarorszag", "Esztergom", "Fo utca 5.", "2028");
        System.out.println(person.getAddress().addressToString());
        Address movedToAddress = new Address("Hungary", "Visegrad", "Nap utca 6.", "2025");
        person.moveTo(movedToAddress);
        System.out.println(person.getAddress().addressToString());
    }
}
