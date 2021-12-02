package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        MathExercise adder = new Adder();
        MathExercise subtracker = new Subtracker();
        MathExercise multiplier = new Multiplier();
        MathExercise divisor = new Divisor();

        System.out.println(adder.getSolution(10,5));
        System.out.println(subtracker.getSolution(10,5));
        System.out.println(multiplier.getSolution(10,5));
        System.out.println(divisor.getSolution(10,5));
    }
}