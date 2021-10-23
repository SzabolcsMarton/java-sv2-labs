package looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            int sums = numbers[i] + numbers[ i + 1 ];
            System.out.print(sums + " ");
        }
    }

    public static void main(String[] args) {
        int[] testArray = {2, 6, 3, 5, 7, 9};
        Sum sum = new Sum();
        sum.printSums(testArray);
    }
}
