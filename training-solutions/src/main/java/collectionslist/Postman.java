package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    List<String>addresses;

    public Postman() {
        this.addresses = new ArrayList<>();
    }

    public void addAddress(String address){
        addresses.add(address);
    }

    public void removeAddress(String addressToRemove){
        addresses.remove(addresses.indexOf(addressToRemove));
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
