package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    private List<Destination> destinations;

    public BucketList(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword){
        if(destinations.isEmpty()){
            return Optional.empty();
        }
        for(Destination actual : destinations){
            if(actual.getName().contains(keyword)){
                return Optional.of(actual);
            }
        }

        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        if(destinations.isEmpty()){
            return Optional.empty();
        }
        for (Destination actual : destinations){
            if(actual.getKmFromHome() < maxKm) {
                return Optional.of(actual);
            }
        }

        return Optional.empty();
    }
}
