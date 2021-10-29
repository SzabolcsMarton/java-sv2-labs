package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> personsRegistered = new ArrayList<>();

    public List<Person> getPersonsRegistered() {
        return personsRegistered;
    }

    public  void addPerson(Person person) {
        personsRegistered.add(person);
    }

}
