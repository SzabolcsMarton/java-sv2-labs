package meetingrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }


    public void printNames() {
        System.out.println("Aktuális tárgyaló termek:");
        for (MeetingRoom actual : meetingRooms) {
            System.out.println(actual.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("Aktuális tárgyaló termek forditott sorrendben:");
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        System.out.println("Aktuális tárgyaló termek forditott sorrendben:");
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom actual : meetingRooms) {
            System.out.println("A(z) " + actual.getName() + " terem: " + actual.getLenght() +
                    "m hosszú, " + actual.getWidth() + "m széles, területe : " + actual.getArea() + "m2");
        }
    }

    public void printMeetinRoomsWithName(String name) {
        for (MeetingRoom actual : meetingRooms) {
            if (name.equals(actual.getName())) {
                System.out.println("A keresett terem: " + actual.getName() + ". A terem: " + actual.getLenght() +
                        "m hosszú, " + actual.getWidth() + "m széles, területe : " + actual.getArea() + "m2");
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom actual : meetingRooms) {
            if (actual.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println("A keresett terem: " + actual.getName() + ". A terem: " + actual.getLenght() +
                        "m hosszú, " + actual.getWidth() + "m széles, területe : " + actual.getArea() + "m2");
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom actual : meetingRooms) {
            if (area < actual.getArea()) {
                System.out.println("A keresett terem: " + actual.getName() + ". A terem: " + actual.getLenght() +
                        "m hosszú, " + actual.getWidth() + "m széles, területe : " + actual.getArea() + "m2");
            }
        }
    }
}
