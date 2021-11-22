package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeTest(){
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("kerek"));
        assertTrue(palindrome.isPalindrome("k"));
        assertTrue(palindrome.isPalindrome(""));
        assertFalse(palindrome.isPalindrome("auto"));

    }


}