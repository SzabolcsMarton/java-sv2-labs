package isahasa.fleet;

public class CanCarryGoodsBehavior implements CanCarryGoods{

    private int cargoWeight;

    private final int maxCargoWeight;

    public CanCarryGoodsBehavior(int maxCargoWeight) {
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
