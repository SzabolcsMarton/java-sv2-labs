package numbers;

public class Percent {
    public double getValue(int number, int percent) {
        return number / (double)100 *percent;
    }

    public double getBase(int number, int percent) {
        return number / percent * (double)100;

    }

    public double getPercent(int number, int percent) {
        return percent / (double)number * 100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200, 30));
        System.out.println(percent.getBase(60,30));
        System.out.println(percent.getPercent(60, 30));
    }
}
