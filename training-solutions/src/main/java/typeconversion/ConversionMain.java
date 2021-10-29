package typeconversion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.convertDoubleToDouble(20.0));
        int[] numbers = {5, -14, 6, 2, 125, 354, 9738, 3};
        byte[] convertedNumbers = conversion.convertIntArrayToByteArray(numbers);
        System.out.println(Arrays.toString(convertedNumbers));
        System.out.println(conversion.getFirstDecimal(15.2254));


    }
}
