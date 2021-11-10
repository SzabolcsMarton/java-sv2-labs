package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();

    public void readOffice() {
        Scanner officeScan = new Scanner(System.in);
        System.out.println("Adja meg az új tárgyaló nevét:");
        String nameOfNewRoom = officeScan.nextLine();

        System.out.println("Adja meg a terem hosszát:");
        int lenghtOfRoom = officeScan.nextInt();
        officeScan.nextLine();

        System.out.println("Adja meg a terem szélességét:");
        int widthOfRoom = officeScan.nextInt();
        officeScan.nextLine();

        office.addMeetingRoom(new MeetingRoom(nameOfNewRoom,lenghtOfRoom,widthOfRoom));
        System.out.println("Tárgyaló sikeressen rögzitve!");
        runMenu();


    }

    public void printMenu() {
        System.out.println("\nMenü: \n" +
                "1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");

    }

    public void runMenu() {

        Scanner scnr = new Scanner(System.in);
        this.printMenu();

        System.out.println("\nKérem válasszon a felsorolt menüpontokból, \nmajd nyomja meg az enter-t:");
        int option = scnr.nextInt();
        scnr.nextLine();

        if (option == 1) {
            readOffice();
        } else if (option == 2) {
            office.printNames();
            runMenu();
        } else if (option == 3) {
            office.printNamesReverse();
            runMenu();
        } else if (option == 4) {
            office.printEvenNames();
            runMenu();
        } else if (option == 5) {
            office.printAreas();
            runMenu();
        } else if (option == 6) {
            System.out.println("Adja meg a keresett tárgyaló nevét:");
            String nameOfRoom = scnr.nextLine();
            office.printMeetinRoomsWithName(nameOfRoom);
            runMenu();
        } else if (option == 7) {
            System.out.println("Adja meg a névtöredéket a keresett tárgyalóhoz:");
            String partOfName = scnr.nextLine();
            office.printMeetingRoomsContains(partOfName);
            runMenu();
        } else if (option == 8) {
            System.out.println("Adja meg a minimum területet:");
            int area = scnr.nextInt();
            scnr.nextLine();
            office.printAreasLargerThan(area);
            runMenu();
        } else if (option == 9) {
            System.out.println("Köszönjük hogy rendszerünket használta! \nViszontlátásra!");
        } else {
            System.out.println("Kérem a csak megadott menüpontokból válasszon!");
            runMenu();
        }

    }

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();

    }
}
