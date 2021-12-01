package inheritencemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if(fuel > tankCapacity){
            throw new IllegalArgumentException("Can not have more fuel than the capacity");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel += fuel;
    }

    private boolean hasEnoughFuel(int km){
        return ((fuel - km * fuelRate / 100) >= 0.0);
    }

    public void drive(int km){
        if(!hasEnoughFuel(km)){
            throw new IllegalStateException("Fuel is not enough");
        }
        fuel -= km * fuelRate /100;
    }

    public double calculateRefillAmount(){
        return this.tankCapacity - this.fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
