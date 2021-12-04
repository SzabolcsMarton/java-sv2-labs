package interfacedependencyinversion.vaccine;

import java.util.List;

public interface Vaccine {

    List<String> getVaccinationList();

    void generateVaccinationList(List<Person> regitrated);

}
