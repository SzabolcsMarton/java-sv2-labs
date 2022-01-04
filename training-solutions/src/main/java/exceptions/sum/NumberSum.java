package exceptions.sum;

public class NumberSum {

    public int getSum(int[] numbers){
        if(numbers == null){
            throw new IllegalArgumentException("numbers can not be null");
        }
        return numberSum(numbers);
    }

    public int getSum(String[] numbers){
        if(numbers == null){
            throw new IllegalArgumentException("numbers can not be null");
        }
        int[]stringConvertedToInt = null;
        try {
            stringConvertedToInt = stringConvertToInt(numbers);
        }catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Can not convert string to int", nfe);
        }
        return numberSum(stringConvertedToInt);
    }

    private int[] stringConvertToInt(String[] numbers){
        int[] convertResult = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            convertResult[i] = Integer.parseInt(numbers[i]);
        }
        return convertResult;
    }


    private int numberSum(int[] numbers){
        int resultSum = 0;
        for (int actual : numbers){
            resultSum += actual;
        }
        return resultSum;
    }

}
