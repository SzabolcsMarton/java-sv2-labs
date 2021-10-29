package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> digits = new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text) {

        for (int i = 0; i < text.length(); i++) {
            char charToTest = text.charAt(i);
            if (Character.isDigit(charToTest)) {
                int num = Integer.parseInt(Character.toString(charToTest));
                digits.add((int) num);
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("auto84kerek4asztal 7ven 2 reggel");
        System.out.println(digits.getDigits());
    }
}
