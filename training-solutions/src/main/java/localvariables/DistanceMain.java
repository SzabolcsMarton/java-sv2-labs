package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(8.54, true);
        System.out.println("Distance: " + distance.getDistanceInKm());
        System.out.println("Exactly: " + distance.isExact());

        int km = (int) distance.getDistanceInKm();
        System.out.println("Distance in whole km: " + km);
    }
}
