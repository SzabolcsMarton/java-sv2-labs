package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String stringToConvert){
        if(stringToConvert == null){
            throw new NullPointerException("StringToConvert is null");
        }
        boolean[] booleansConverted = new boolean[stringToConvert.length()];
        for (int i = 0; i < stringToConvert.length(); i++){
            char character = stringToConvert.charAt(i);
            checkCharacterIsValid(character);
            booleansConverted[i] = character == '0' ? false : true;
        }
        return booleansConverted;
    };



    public String booleanArrayToBinaryString(boolean[] booleansToConvert){
        checkBooleanArrayIsValid(booleansToConvert);
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < booleansToConvert.length; i++){
            if(booleansToConvert[i] == true){
                binaryString.append("1");
            }else {
                binaryString.append("0");
            }
        }
        return binaryString.toString();
    }

    private void  checkBooleanArrayIsValid(boolean[] booleansToConvert){
        if(booleansToConvert == null){
            throw new NullPointerException("BooleansArray to convert is null");
        }
        if(booleansToConvert.length == 0){
            throw new IllegalArgumentException("BooleansArray to convert is empty");
        }
    }

    private void checkCharacterIsValid(char character){
        if(character != '0' && character != '1'){
            throw new IllegalArgumentException("String To Convert is not valid format");
        }
    }


}
