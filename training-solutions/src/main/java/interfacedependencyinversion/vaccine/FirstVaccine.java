package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{

    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> regitrated) {
        addPregnants(regitrated);
        addOlderThan65(regitrated);
        addTheRest(regitrated);

    }

    private void addPregnants(List<Person> registrated){
        for (Person actual : registrated){
            if(actual.getPregnant() == Pregnancy.YES){
                vaccinationList.add(actual);
            }
        }
    }

    private void addOlderThan65(List<Person> registrated){
        for (Person actual : registrated){
            if(actual.getAge() >65){
                vaccinationList.add(actual);
            }
        }
    }

    private void addTheRest(List<Person> registrated){
        for (Person actual : registrated){
            if( actual.getPregnant() != Pregnancy.YES && actual.getAge() <= 65){
                vaccinationList.add(actual);
            }
        }
    }
}
