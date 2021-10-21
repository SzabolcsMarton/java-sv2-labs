package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(5));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(15));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(5));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Nem Joe"));

        System.out.println(introControl.calculateBonus(568_457));
        System.out.println(introControl.calculateBonus(1_568_457));

        System.out.println(introControl.calculateConsumtion(5000, 6000));
        System.out.println(introControl.calculateConsumtion(9000, 1000));

        introControl.printNumbers(15);

        introControl.printNumbersBetween(10,15);

        introControl.printNumberBetweenAnyDirection(10, 20);
        introControl.printNumberBetweenAnyDirection(20, 10);

        introControl.printOddNumbers(10);
    }
}
