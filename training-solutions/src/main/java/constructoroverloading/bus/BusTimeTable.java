package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> result = new ArrayList<>();
        for (int i = firstHour; i < lastHour; i++) {
            result.add(new SimpleTime(i, everyMinute));
        }
        this.timeTable = result;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        for (int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).getDifference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more bus!");
    }
}
