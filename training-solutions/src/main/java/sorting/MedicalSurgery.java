package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> dailyPatients;

    public MedicalSurgery(List<Patient> dailyPatients) {
        this.dailyPatients = dailyPatients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> resultsInOrder = new ArrayList<>(dailyPatients);
        resultsInOrder.sort(new PatientComparator());
        return resultsInOrder;

    }

    public List<Patient> getDailyPatients() {
        return dailyPatients;
    }
}
