package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    private Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> vaccinationOrder = new PriorityQueue<>();
        for (Person actual : people) {
            if(actual.getAge() >= 18 && actual.getAge() <= 65) {
                vaccinationOrder.add(actual.getAge());
            }
        }
        return vaccinationOrder;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("a",10));
        people.add(new Person("b",35));
        people.add(new Person("c",65));
        people.add(new Person("d",30));
        people.add(new Person("e",17));
        people.add(new Person("f",19));
        people.add(new Person("g",67));
        Vaccination vaccination = new Vaccination();
        PriorityQueue<Integer> result = (PriorityQueue<Integer>) vaccination.getVaccinationOrder(people);
        System.out.println(result);
        System.out.println(result.poll());
        System.out.println(result.poll());
    }
}
