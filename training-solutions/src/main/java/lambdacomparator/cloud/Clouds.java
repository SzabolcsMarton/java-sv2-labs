package lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    private List<CloudStorage> storages = new ArrayList<>();


    public CloudStorage alphabeticallyFirst(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator.comparing(CloudStorage::getProvider,
                Comparator.comparing(s -> s.trim().toLowerCase())));
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator.comparing(CloudStorage::getPayPeriod,
                Comparator.nullsFirst(Comparator.comparing(PayPeriod::getLength)))
                .thenComparingDouble(CloudStorage::getPrice));

    }


    public List<CloudStorage> getStorages() {
        return storages;
    }
}
