package searching;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new ArrayList<>();

    public void addProperty(LostProperty property){
        lostProperties.add(property);
    }

    public LostProperty findLostProperty(LostProperty searched) {
        int index = Collections.binarySearch(lostProperties, searched);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return lostProperties.get(index);
    }

    public List<LostProperty> getLostProperties() {
        return new ArrayList<>(lostProperties);
    }
}
