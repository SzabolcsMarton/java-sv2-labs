package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn){
        boolean result;
        if (ssn.length() != 9){
            result = false;
        }
        try{
            int sum = 0;
            for(int i = 0; i < ssn.length() - 1; i +=2){
                sum += charToInt(ssn.charAt(i)) * 3;
            }
            for(int i = 1; i < ssn.length() - 1; i +=2){
                sum += charToInt(ssn.charAt(i)) * 7;
            }
            result = (charToInt(ssn.charAt(8)) == sum % 10);
        }catch (IllegalArgumentException iae){
            result = false;
        }
        return result;
    }

    private int charToInt(char c){
        if(!Character.isDigit(c)){
            throw new IllegalArgumentException("Nem szamot adott meg!");
        }
       return c - '0';
    }
}
