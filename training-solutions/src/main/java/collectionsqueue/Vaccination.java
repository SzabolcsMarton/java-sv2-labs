package collectionsqueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    private Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> vaccinationOrder = new PriorityQueue<>();
        for (Person actual : people) {
            if(actual.getAge() >= 18 || actual.getAge() <= 65) {
                vaccinationOrder.add(actual.getAge());
            }
        }
        return vaccinationOrder;
    }
}
