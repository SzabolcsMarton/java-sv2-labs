package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class AirPort {

    private List<Flight> flights = new ArrayList<>();

    public void addFlights(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Törölt járatok: \n");
        for (int i = 0; i < flights.size(); i++){
            if(flights.get(i).getStatus() == Status.DELETED){
                sb.append(flights.get(i).getFlightNumber() + "\n");

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        AirPort airPort = new AirPort();

        Flight flightToLondon = new Flight("w6 7853", Status.AKTIVE);
        Flight flightToDublin = new Flight("FN 1023", Status.DELETED);
        Flight flightToMoscow = new Flight("RU 1254", Status.DELETED);
        Flight flightToMadrid = new Flight("SP 1202", Status.AKTIVE);
        Flight flightToParis = new Flight("FR 1040", Status.AKTIVE);

        airPort.addFlights(flightToLondon);
        airPort.addFlights(flightToDublin);
        airPort.addFlights(flightToMadrid);
        airPort.addFlights(flightToMoscow);
        airPort.addFlights(flightToParis);

        System.out.println(airPort.getDeletedFlights());


    }



}
