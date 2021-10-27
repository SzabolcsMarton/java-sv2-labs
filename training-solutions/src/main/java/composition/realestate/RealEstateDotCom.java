package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest","1035", "Kossuth utca", 10);
        Details details = new Details("Amazing area, lovely neightbours, good condition, with a lovely view.",
                address, 60, 2 );
        RealEstate realEstate = new RealEstate("Flat for sale!",40.5, details);

        System.out.println(address.toString());
        System.out.println(details.toString());
        System.out.println(realEstate.toString());




    }
}
