package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5+6;
        int y = 11 - x;
        int z = 8;

        boolean b = x > y;
        boolean c = (b == true) || x > 5 ? true : false;

        z++;

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
