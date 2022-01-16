package searching;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new ArrayList<>();

    public void addProperties(LostProperty property){
        lostProperties.add(property);
    }

    public LostProperty findLostProperty(String description){
        LostProperty temp = new LostProperty(description, LocalDate.now());
        int index = Collections.binarySearch(lostProperties,temp);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return lostProperties.get(index);
    }

    public List<LostProperty> getLostProperties() {
        return new ArrayList<>(lostProperties);
    }
}
