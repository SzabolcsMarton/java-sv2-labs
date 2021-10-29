package conversions;

public class TooBigNumber {
    public long getRightResult(int number){
       long result = Integer.MAX_VALUE + number;
       return result;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber= new TooBigNumber();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(tooBigNumber.getRightResult(1));
    }
}
