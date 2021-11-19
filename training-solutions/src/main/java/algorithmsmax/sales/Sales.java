package algorithmsmax.sales;

import java.util.List;

public class Sales {

    private int getDifferent(Salesperson salesperson){
        return salesperson.getAmount() - salesperson.getTarget();
    }

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson salesperson = null;
        for (Salesperson actual : sales){
            if(salesperson == null || actual.getAmount() > salesperson.getAmount()){
                salesperson = actual;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson salesperson = null;
        for (Salesperson actual : sales){
            if(salesperson == null || getDifferent(actual ) > getDifferent(salesperson)){
                salesperson = actual;
            }
        }
        return salesperson;
    }

}
