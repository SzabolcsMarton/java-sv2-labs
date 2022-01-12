package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<Thermometer> thermometers;
    private List<String> roomsToHeat;
    private int temperatureLimit;

    public Thermostat() {
        this.thermometers = new ArrayList<>();
        this.roomsToHeat = new ArrayList<>();
        this.temperatureLimit = 23;
    }

    public void addThermometer(Thermometer thermometer){
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < temperatureLimit) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
        this.thermometers.add(thermometer);
    }

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

}
