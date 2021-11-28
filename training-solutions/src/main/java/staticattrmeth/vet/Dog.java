package staticattrmeth.vet;

public class Dog {
    private String name;
    private int age;
    private Species species;
    private long codeNr;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setCodeNr(long codeNr) {
        this.codeNr = codeNr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }

    public long getCodeNr() {
        return codeNr;
    }
}
