package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Dogi1",5, "black");
        Dog dog2 = new Dog("Dogi2",7, "white");
        Dog dog3 = new Dog("dogie3", 6, "brown");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);
        Dog dog4 = dogs.get(1);
        dog4.setColour("blue");
        System.out.println(dog4);
        Dog dog5 = new Dog("Dogie5", 8, "red");
        System.out.println(dog5);
        dog5 = dogs.get(1);
        System.out.println(dog5);
        dogs.add(dog5);
        Dog dog6 = dog4;
        dog6.setColour("green");
        System.out.println(dogs);
        List<Dog> otherDogs = dogs;
        Dog dog7 = dog4;
        dog7.setColour("yellow");
        System.out.println(otherDogs);
        dog2.setColour("pink");
        System.out.println(otherDogs);
        dog2 = null;
        System.out.println(otherDogs);
        Dog dog8 =dogs.get(1);
        dog8 = null;
        System.out.println(otherDogs);
        Dog dog9 = dogs.get(1);
        dog9.setColour("purple");
        System.out.println(otherDogs);





    }
}
