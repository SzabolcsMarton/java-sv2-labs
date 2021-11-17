package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = 1;
         while (number % 2 !=0){
             System.out.println("Adjon meg egy szamot!");
             try {
                 int scnrNumber = Integer.parseInt(scnr.nextLine());
                 number = scnrNumber;
                 System.out.println(number);
             }catch (NumberFormatException nfe){
                 throw new IllegalStateException("Nem szamot adott meg!!", nfe);
             }finally {
                 System.out.println("Vege a kornek!");
             }
         }
    }
}
