package methodvarargs.examstats;

public class ExamStats {
    private double max;

    public ExamStats(int maxPoints) {
        this.max = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of result cannot be empty.");
        }
        int numberOfTop = 0;
        for (int point : results) {
            if (point > (1.0 * limitInPercent / 100) * max) {
                numberOfTop++;
            }
        }
        return numberOfTop;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int point : results) {
            if (point < (1.0 * limitInPercent / 100) * max) {
                return true;
            }
        }
        return false;
    }
}
