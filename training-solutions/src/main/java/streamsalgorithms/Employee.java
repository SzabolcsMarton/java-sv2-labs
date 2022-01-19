package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("a", 1970),
                new Employee("b", 1975),
                new Employee("c", 1980),
                new Employee("d", 1985),
                new Employee("e", 1990),
                new Employee("f", 1995),
                new Employee("g", 2000)
        );


//                Összegezd az alkalmazottak születési éveit!

        int getsumOfEmployeesYearsOfBirth =
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .sum();
        System.out.println(getsumOfEmployeesYearsOfBirth);

//                Összegezd az alkalmazottak életkorát!

        int sumOfEmployeesAge =
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .map(year -> LocalDate.now().getYear() - year)
                        .sum();
        System.out.println(sumOfEmployeesAge);

//                Add vissza streammel, hány alkalmazott van a listában!

        long numberOfEmployees =
                employees.stream()
                        .count();
        System.out.println(numberOfEmployees);

//                Add vissza, hány alkalmazott született 1990-nél korábban!

        long numberOfEmployeesBornBefore1990 =
                employees.stream()
                        .filter(employee -> employee.getYearOfBirth() < 1990)
                        .count();
        System.out.println(numberOfEmployeesBornBefore1990);

//                Add vissza a legkorábban született alkalmazott születési évét!

        int oldestEmployeesBirthYear =
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .min()
                        .orElseThrow(() -> new IllegalArgumentException("Empty employee list"));
        System.out.println(oldestEmployeesBirthYear);

//                Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)

        String oldesrtEmployeeName =
                employees
                        .stream()
                        .sorted((o1, o2) -> o1.getYearOfBirth() - o2.getYearOfBirth())
                        .map(Employee::getName)
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Empty employee list"));
        System.out.println(oldesrtEmployeeName);


//                Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?

        boolean areAllEmployeeBornBefore1980 =
                employees
                        .stream()
                        .allMatch(employee -> employee.getYearOfBirth() < 1980);
        System.out.println(areAllEmployeeBornBefore1980);

//                Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!

        System.out.println(employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList())
        );

//                Add vissza egy listában az összes alkalmazott nevét!
        System.out.println(
                employees.stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList())
        );


//                Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!

        System.out.println(
                employees.stream()
                        .filter(employee -> employee.getYearOfBirth() < 1990)
                        .map(Employee::getName)
                        .collect(Collectors.toList())
        );
    }
}
