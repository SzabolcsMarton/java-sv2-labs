package chars;

public class Words {
    public String pushWord(String word) {
        char [] charToTransform =word.toCharArray();
        for (int i = 0; i < charToTransform.length; i++) {
            charToTransform[i] += 1;
        }
        return new String(charToTransform);
    }

    public static void main(String[] args) {
        Words words = new Words();
        String pushed = words.pushWord("alma");
        System.out.println(pushed);
    }
}
