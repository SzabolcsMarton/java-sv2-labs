package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;

    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int leftOver = 0;
        if(cargoWeight <= this.maxCargoWeight){
            this.cargoWeight = cargoWeight;
        }else {
            this.cargoWeight = maxCargoWeight;
            leftOver = cargoWeight - maxCargoWeight;
        }
        return leftOver;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
