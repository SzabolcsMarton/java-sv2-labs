package enumtype.position;

public enum Position {

    DIRECTOR(1_000_000, "Phone, Insurance, Gym "), SECRETARY(800_000, "Phone, Insurance, Gym"),
    WORKER(600_000, "Insurance, Gym"), CLEANER(500_000, "Insurance, Gym");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
