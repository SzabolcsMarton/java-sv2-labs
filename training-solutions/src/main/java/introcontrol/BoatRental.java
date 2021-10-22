package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int placesInBoat1 = 5;
        int placesInBoat2 = 3;
        int placesInBoat3 = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány fő ?:");
        int passangers = scanner.nextInt();

        int freePlaces = 10;
        int boats = 3;

        if(passangers > 3 ) {
            System.out.println("Boat 1 (5 fős)");
            freePlaces -= placesInBoat1;
            passangers -= placesInBoat1;
            boats--;
        }

        if (passangers > 2) {
            System.out.println("Boat 2 (3 fős)");
            freePlaces -= placesInBoat2;
            passangers -= placesInBoat2;
            boats--;
        }

        if(passangers > 0){
            System.out.println("Boat 3 (2 fős)");
            freePlaces -= placesInBoat3;
            passangers -= placesInBoat3;
            boats--;
        }

        if(passangers > 0){
            System.out.println("Sajnos elfogytak a helyek, a parton maradtak: "+ passangers);
        }else {
            System.out.println("Maradt: " + freePlaces + " főnek hely.");
            System.out.println("Maradt: " + boats + " csónak");
        }
    }
}
