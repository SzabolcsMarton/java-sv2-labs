package stringseparate;

import conversions.Digits;

import java.util.ArrayList;
import java.util.List;

public class Codes {

    public String getCodesWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < codes.size(); i++) {
            char c = codes.get(i).toCharArray()[0];
            if (Character.isAlphabetic(c)) {
                if ((i != 0)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                }
            }
            if (Character.isAlphabetic(c)) {
                sb.append(codes.get(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> codesToWrite = new ArrayList<>();
        codesToWrite.add("45f2feg");
        codesToWrite.add("s5f2feg");
        codesToWrite.add("55f2feg");
        codesToWrite.add("g5f2feg");
        codesToWrite.add("45f2feg");
        codesToWrite.add("a5f2feg");
        codesToWrite.add("a5f2feg");
        codesToWrite.add("35f2feg");
        codesToWrite.add("b5f2feg");

        System.out.println(codes.getCodesWithLetter(codesToWrite));

    }

}
