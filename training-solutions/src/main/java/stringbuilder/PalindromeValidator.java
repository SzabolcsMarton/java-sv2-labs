package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word.trim());
        if(word.equalsIgnoreCase(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("ajto"));
        System.out.println(palindromeValidator.isPalindrome("kerek"));
    }
}
