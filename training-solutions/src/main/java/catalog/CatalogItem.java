package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price ,Feature...feature) {
        validate(registrationNumber, price, feature);
        this.features.addAll(Arrays.asList(feature));
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    private void validate(String registrationNumber, int price ,Feature...feature){

        if(Validators.isBlank(registrationNumber)){
            throw new IllegalArgumentException("Registration number is invalid");
        }
        if(feature == null || feature.length == 0){
            throw new IllegalArgumentException("Feature is invalid");
        }
        if(price <= 0){
            throw new IllegalArgumentException("Price is invalid");
        }
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int numberOfPagesAtOneItem() {
        int sum = 0;
        for (Feature actual : features){
            if (actual.getClass() == PrintedFeatures.class){
                sum +=  ((PrintedFeatures) actual).getNumberOfPages();
            }
        }
        return sum;
    }

    public int fullLengthAtOneItem(){
        int sum = 0;

        for (Feature actual : features){
            if (actual.getClass() == AudioFeatures.class){
                sum +=  ((AudioFeatures) actual).getLength();
            }
        }
        return sum;
    }

    public List<String> getContributors(){
        List<String> contributors = new ArrayList<>();
        for (Feature actual : features){
            contributors.addAll(actual.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles(){
        List<String> titles = new ArrayList<>();
        for (Feature actual : features){
            titles.add(actual.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature actual : features){
            if (actual.getClass() == AudioFeatures.class){
                return  true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature actual : features){
            if (actual.getClass() == PrintedFeatures.class){
                return  true;
            }
        }
        return false;
    }

}
