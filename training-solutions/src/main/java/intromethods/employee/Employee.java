package intromethods.employee;

public class Employee {
    private String nameOfEmployee;
    private int hiringYear;
    private int salary;

    public Employee(String nameOfEmployee, int hiringYear, int salary) {
        this.nameOfEmployee = nameOfEmployee;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void raiseSalary(int amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                '}';
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }


}
