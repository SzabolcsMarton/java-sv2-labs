package algorithmsmax.sales;

import java.util.List;

public class Sales {

    private int getDiffHeigher(Salesperson sp) {
        return sp.getAmount() - sp.getTarget();
    }

    private int getDiffLower(Salesperson sp) {
        return sp.getTarget() - sp.getAmount();
    }

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson salesperson = null;
        for (Salesperson actual : sales) {
            if (salesperson == null || actual.getAmount() > salesperson.getAmount()) {
                salesperson = actual;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson salesperson = null;
        for (Salesperson actual : sales) {
            if (salesperson == null || getDiffHeigher(actual) > getDiffHeigher(salesperson)) {
                salesperson = actual;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson salesperson = null;
        for (Salesperson actual : sales) {
            if (salesperson == null || getDiffLower(actual) > getDiffLower(salesperson)) {
                salesperson = actual;
            }
        }
        return salesperson;

    }

}
