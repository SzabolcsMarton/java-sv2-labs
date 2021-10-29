package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        System.out.println(Position.values()[3]);
        System.out.println(Position.SECRETARY);
        System.out.println(Position.DIRECTOR.getBenefit());
        System.out.println(Position.WORKER.getSalary());

    }
}
