package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix ="Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String empty1 = "";
        String empty2 = "";
        String empty3 = empty1 + empty2;
        System.out.println(empty3);
        System.out.println(empty3.length());

        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.substring(0,1) + "," + abcde.substring(2,3)); //version 1
        System.out.println(abcde.charAt(0) + "," + abcde.charAt(2)); //version 2
        System.out.println(abcde.substring(0,3));

    }
}
