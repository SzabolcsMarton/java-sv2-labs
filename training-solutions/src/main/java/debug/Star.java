package debug;

public class Star {
    public void writeStars(int[] numbers) {
        int prev = 0;// take out and put before the for loop

        for (int i = 0; i < numbers.length; i++) {

            int stars = numbers[i] - prev;
            printStars(stars);
            prev = numbers[i];
            System.out.println();
        }
    }



    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 10, 12};
        Star star = new Star();
        star.writeStars(nums);
    }
}
