package controliteration.division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog ki írni.");
        int numberUntil = scnr.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider = scnr.nextInt();

        for (int i = 1; i <= numberUntil; i++){
            if(i % divider == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        int i = 1;
        while ( i <= numberUntil){
            if( i % divider == 0 ){
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
