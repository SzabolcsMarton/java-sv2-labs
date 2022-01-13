package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String tajNumber;

    public Person(String name, int age, String tajNumber) {
        this.name = name;
        this.age = age;
        this.tajNumber = tajNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return tajNumber.equals(person.tajNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tajNumber);
    }
}
