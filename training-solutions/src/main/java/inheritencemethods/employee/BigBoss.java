package inheritencemethods.employee;

public class BigBoss extends Boss{

    private double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public int getNumberOfEmployee(){
        return super.getNumberOfEmployees();
    }

    public double getBonus() {
        return bonus;
    }
}
