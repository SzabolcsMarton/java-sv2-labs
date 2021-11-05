package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many Elements of Fibonacci sequence");
        int number = scnr.nextInt();

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        //with for loop
//        for ( int i = 2; i < number; i++){
//            int next = fibonacci.get(i-1) + fibonacci.get(i - 2);
//            fibonacci.add(next);
//        }
        //with while
//        int i = 2;
//        while ( i < number){
//            int next = fibonacci.get(i-1) + fibonacci.get(i - 2);
//            fibonacci.add(next);
//            i++;
//        }
        int i = 2;
        do {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
            i++;
        } while (i < number);

        System.out.println(fibonacci);

    }
}
