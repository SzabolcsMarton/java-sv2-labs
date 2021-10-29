package operators;

public class Operators {

    public boolean isEven(int n){
        return n / 2 == 0 ? true : false;
    }

    public String getResultOfDivision(int number, int divisor){
       int result = number / divisor;
       int leftOver = number % divisor;
        return number + " / " + divisor + " = " + result + ", maradek: " + leftOver;
    }

    public String isNull(String s){
        return s == null ? "null erteku" : "nem null erteku";
    }

    public boolean isEmpty(String s){
        return s == null || s.equals("");
    }

}
