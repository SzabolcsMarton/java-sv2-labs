package introexceptionthrow;

public class Validation {

    public void validateName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Elfelejtett nevet beirni!");
        }
    }

    public void validateAge(String ageInString){
        if(ageInString.length() == 0){
            throw new IllegalArgumentException("Elfelejtett eletkort beirni!");
        }

        char[] charsInAge = ageInString.toCharArray();
        for (char c : charsInAge) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Nem szamot irt be: " + ageInString);
            }
        }
        int age = Integer.parseInt(ageInString);
        if (age > 120 || age < 0){
            throw new IllegalArgumentException("Nem valos eletkor!" + ageInString);
        }

    }
}
