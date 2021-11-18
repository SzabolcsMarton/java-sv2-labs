package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

        public int SalesAmountSumCalculator(List<SalesPerson> salesPersons){
            int sum = 0;
            for (SalesPerson actual: salesPersons){
                sum += actual.getAmount();
            }
            return sum;
        }
}
