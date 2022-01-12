package nestedclasses.thermo;

public class Thermometer {

    private final String roomName;

    private int roomTemperature;

    private ThermometerObserver thermometerObserver;

    public Thermometer(String roomName, int roomTemperature) {
        this.roomName = roomName;
        this.roomTemperature = roomTemperature;
    }

    public void onTemperatureChanged() {
        if (thermometerObserver != null) {
            thermometerObserver.handleTemperatureChange(roomTemperature, roomName);
        }
    }

    public String getRoomName() {
        return roomName;
    }

    public int getRoomTemperature() {
        return roomTemperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }
    public void setTemperature(int temperature){
        this.roomTemperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.thermometerObserver = observer;
        onTemperatureChanged();
    }

//    Legyen metódusa, amely meghívásával a figyelő bejegyezheti magát
//    mint figyelő (setThermometerObserver(ThermometerObserver observer))! (Figyeljünk rá,
//    hogy a figyelő bejegyzése hőmérséklet változásnak számít.)
}
