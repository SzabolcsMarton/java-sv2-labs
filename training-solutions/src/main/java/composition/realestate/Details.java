package composition.realestate;

public class Details {
    private String description;
    private Address address;
    private int squereMeter;
    private int areaOfSite;


    public Details(String description, Address address, int squereMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.squereMeter = squereMeter;
        this.areaOfSite = areaOfSite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSquereMeter() {
        return squereMeter;
    }

    public void setSquereMeter(int squereMeter) {
        this.squereMeter = squereMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }

    @Override
    public String toString() {
        return "Details { description: " + description +
                ",  address: " + address +
                ",  squereMeter: " + squereMeter +
                ",  areaOfSite: " + areaOfSite + " }";
    }
}
