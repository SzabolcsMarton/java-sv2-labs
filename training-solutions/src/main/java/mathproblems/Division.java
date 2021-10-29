package mathproblems;

import java.util.ArrayList;
import java.util.List;

public class Division {
    public  void  getDivision( int number){
        for(int i = 1; i < number+1; i++){
            if((number % i) == 0){
                System.out.println(number + " osztoja: " + i);
            }
        }
    }

    public void getRightNumbers(int[] numbers){
        for(int i = 1; i < numbers.length ; i++){
            if(numbers[i] % i == 0 ){
                System.out.print(numbers[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        Division division = new Division();
     //   division.getDivision(12);

        int[] numbers = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};

        division.getRightNumbers(numbers);
    }
}
