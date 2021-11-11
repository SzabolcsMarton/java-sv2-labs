package introexceptiontrace.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

   // private List<Fish> ornamentalFish = new ArrayList<>();
    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }

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
