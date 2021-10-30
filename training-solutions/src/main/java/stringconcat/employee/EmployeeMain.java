package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Sanyi Bacsi", "fogdmeg", 350_000);
        System.out.println(employee.toString());
    }
}
