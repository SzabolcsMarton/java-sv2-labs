package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculatePerimeter(10.0));
        System.out.println(circleCalculator.calculateArea(10.0));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(10.0, 20.0));
        System.out.println(cylinderCalculator.CalculateSurfaceArea(10.0, 20.0));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(10.0, 20.0));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(10.0, 20.0));
    }
}
