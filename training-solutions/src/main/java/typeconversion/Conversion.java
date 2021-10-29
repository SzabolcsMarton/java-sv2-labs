package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number){
        int intNumber = (int) number;
        double backToDouble =  intNumber;
        return backToDouble;
    }

    public byte[] convertIntArrayToByteArray(int[] randomNumbers){
        byte[] numberArray = new byte[randomNumbers.length];
        for (int i = 0;i < randomNumbers.length; i++){
            if(randomNumbers[i] < 127 && randomNumbers[i] > 0){
                numberArray[i] = (byte) randomNumbers[i];
            }else{
                numberArray[i] = -1;
            }
        }
        return numberArray;
    }
}
