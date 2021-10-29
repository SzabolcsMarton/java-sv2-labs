package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(11));
        System.out.println("Is Even number: " + operators.isEven(8));
        System.out.println(operators.getResultOfDivision(16,3));
        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull("ajto"));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("ajto"));

    }
}
