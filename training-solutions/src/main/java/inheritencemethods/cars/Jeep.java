package inheritencemethods.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Extra fuel is more than extra Capacity");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    private boolean isEnoughFuelJeep(int km) {
        return ((super.getFuel() + extraFuel) - (km * super.getFuelRate() / 100)) >= 0.0;
    }

    @Override
    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new IllegalArgumentException("Fuel is not enough");
        }
        double usedFuel = km * super.getFuelRate() / 100;
        extraFuel -= usedFuel;
        if (extraFuel < 0) {
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    @Override
    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
