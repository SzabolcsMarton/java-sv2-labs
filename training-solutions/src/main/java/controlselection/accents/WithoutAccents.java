package controlselection.accents;

public class WithoutAccents {
    public String lettersWithAccents = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
    public String lettersWithNoAccents = "aeiooouuuAEIOOOUUU";

    public  char accentsConverter(char charToConvert){
        int index = lettersWithAccents.indexOf(charToConvert);
            if (index != -1){
                return lettersWithNoAccents.charAt(index);
            }else {
                return charToConvert;
            }
    }
}
