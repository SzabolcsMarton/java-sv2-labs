package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        if (catalogItem == null) {
            throw new IllegalArgumentException("CatalogItem is null");
        }
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        validator(registrationNumber);
        int index = 0;
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(registrationNumber)) {
                index = i;
                break;
            }
        }
        catalogItems.remove(index);
    }

    private void validator(String registrationNumber) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Registration Number is invalid");
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) {
                result.add(actual);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) {
                result.add(actual);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int sumOfPages = 0;
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) {
                sumOfPages += actual.numberOfPagesAtOneItem();
            }
        }
        return sumOfPages;
    }

    public int getFullLength() {
        int sumOfLength = 0;
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) {
                sumOfLength += actual.fullLengthAtOneItem();
            }
        }
        return sumOfLength;
    }

    public double averagePageNumberOver(int minPages) {
        if (minPages <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }

        List<Feature> temp = new ArrayList<>();
        double sumOfPages = 0.0;

        for (CatalogItem catalogItem : catalogItems) {
            temp.addAll(catalogItem.getFeaturesOverPageLimit(minPages));
        }

        for (Feature actual : temp) {
            sumOfPages += ((PrintedFeatures) actual).getNumberOfPages();
        }

        if (sumOfPages == 0) {
            throw new IllegalArgumentException("No page");
        }

        return sumOfPages / temp.size();
    }


    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (hasFeature(searchCriteria, catalogItem)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private boolean hasFeature(SearchCriteria searchCriteria, CatalogItem catalogItem) {
        for (Feature actualFeature : catalogItem.getFeatures()) {
            if (searchCriteria.hasTitle() &&
                    searchCriteria.hasContributor() &&
                    actualFeature.getTitle().equals(searchCriteria.getTitle()) &&
                    actualFeature.hasContributors(searchCriteria.getContributor())) {
                return true;
            }
            if (searchCriteria.hasContributor() &&
                    !searchCriteria.hasTitle() &&
                    actualFeature.hasContributors(searchCriteria.getContributor())) {
                return true;
            }
            if (searchCriteria.hasTitle() &&
                    !searchCriteria.hasContributor() &&
                    actualFeature.getTitle().equals(searchCriteria.getTitle())) {
                return true;
            }
        }
        return false;
    }


}

