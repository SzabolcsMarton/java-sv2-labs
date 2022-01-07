package exceptionmulticatch.converter;

public class AnswerStat {

    private final BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String stringToConvert) {
        try {
            return converter.binaryStringToBooleanArray(stringToConvert);
        } catch (NullPointerException | IllegalArgumentException exep) {
            throw new InvalidBinaryStringException(exep.getMessage(), exep);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] bools = convert(answers);
        int trueCounter = 0;
        for (boolean actual : bools){
            if (actual){
                trueCounter++;
            }
        }

        return (int) Math.round((double) trueCounter / bools.length * 100);
    }
}
