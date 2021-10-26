package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Sanyi",2021,400_000);
        System.out.println(employee.toString());
        employee.raiseSalary(50_000);
        System.out.println(employee.toString());

        System.out.println(employee.getNameOfEmployee());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());

    }
}
