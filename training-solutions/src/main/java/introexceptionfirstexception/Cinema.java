package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\nVásárló neve: ");

        System.out.println("Adja meg a nevét:");
        String name = scnr.nextLine().trim();
        System.out.println("Adja meg a film cimet:");
        String title = scnr.nextLine().trim();
        System.out.println("Hány darab jegyet vásárol:");
        int amountOfTickets = scnr.nextInt();
        System.out.println("Melyik sorban:");
        int numberOfRow = scnr.nextInt();

        sb.append(name).append("\n").append("Film címe: ").append(title).append("\n").append("Lefoglalt helyek: ");
        for (int i = 1; i <= amountOfTickets; i++){
            sb.append(numberOfRow).append(". sor ").append(i).append(". szék");
            if(i < amountOfTickets){
                sb.append(",");
            }
        }
        sb.append("\n").append("Jó szórakozást!");
        System.out.println(sb);
    }
}
