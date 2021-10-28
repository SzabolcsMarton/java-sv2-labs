package literals;

public class LiteralsMain {
    private String concatenated = "" + 1 + "" + 2 + "";
    private double quotien = 3 / 4D ;// a double miatt szukseges a D mert 2 int-et osztunk
    private long big = 3_244_444_444L ;
    private String word  = "title".toUpperCase();

    public static void main(String[] args) {
        LiteralsMain lMain = new LiteralsMain();
        System.out.println(lMain.concatenated);
        System.out.println(lMain.quotien);
        System.out.println(lMain.big);
        System.out.println(lMain.word);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }

}
