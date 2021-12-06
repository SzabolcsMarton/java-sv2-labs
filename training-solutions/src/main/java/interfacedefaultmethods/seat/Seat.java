package interfacedefaultmethods.seat;

public interface Seat {

    default int getNumberOfSeats() {
        return 5;
    }
}
