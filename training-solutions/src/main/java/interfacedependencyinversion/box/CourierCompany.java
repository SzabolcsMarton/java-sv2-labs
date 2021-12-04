package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {
        Box small = new SmallBox();
        System.out.println(small.getPrice() + " " + small.getSize());

        Box medium = new MediumBox();
        System.out.println(medium.getPrice() + " " + medium.getSize());

        Box large = new LargeBox();
        System.out.println(large.getPrice() + " " + large.getSize());

        Box xLarge = new ExtraLargeBox();
        System.out.println(xLarge.getPrice() + " " + xLarge.getSize());
    }
}
