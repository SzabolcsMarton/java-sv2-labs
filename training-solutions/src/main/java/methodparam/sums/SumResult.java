package methodparam.sums;

public class SumResult {

    private final double sumOfPositives;
    private final double sumOfNegatives;

    public SumResult(double sumOfPositives, double sumOfNegatives) {
        this.sumOfPositives = sumOfPositives;
        this.sumOfNegatives = sumOfNegatives;
    }

    public double getSumOfPositives() {
        return sumOfPositives;
    }

    public double getSumOfNegatives() {
        return sumOfNegatives;
    }
}
