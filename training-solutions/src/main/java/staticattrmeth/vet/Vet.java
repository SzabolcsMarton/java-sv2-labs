package staticattrmeth.vet;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Dog> registeredDogs = new ArrayList<>();

    private static long code = 1;

    public void addDog(Dog dogToAdd) {
        dogToAdd.setCodeNr(code);
        registeredDogs.add(dogToAdd);
        code++;
    }

    public List<Dog> getRegisteredDogs() {
        return registeredDogs;
    }

    public static long getCode() {
        return code;
    }
}
