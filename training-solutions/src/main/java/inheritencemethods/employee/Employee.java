package inheritencemethods.employee;

import inheritencemethods.employee.Person;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent){
        this.salary += this.salary * (percent / 100.0);
    }
}
