package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("hal", "kek"));
        aquarium.addFish(new Fish("halacska", "piros"));
        aquarium.addFish(new Fish("haluci", "sarga"));
        System.out.println(aquarium.getNumberOfFish());

    }
}
// a hiba ott keletkezik hogy a lista nincs peldanyositva
// igy nem is tudja hozza adni az uj halat, ezert nullPointerException-t dob