package inheritencemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployeeTest(){
        Employee employee = new Employee("Jozska","Szentendre", 300_000 );

        assertEquals("Jozska", employee.getName());
        assertEquals("Szentendre", employee.getAddress());
        assertEquals(300_000, employee.getSalary());

    }

    @Test
    void raiseSalaryTest(){
        Employee employee = new Employee("Jozska","Szentendre", 300_000 );
        employee.raiseSalary(10);

        assertEquals(330_000,employee.getSalary());

    }

}