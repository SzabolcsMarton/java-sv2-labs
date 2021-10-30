package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Toth",null, "Sanyi", Title.Dr).concatNameHungarianStyle());
        System.out.println(new Name("Toth","B", "Sandor", null).concatNameHungarianStyle());
        System.out.println(new Name("Toth","", "Sandor", null).concatNameHungarianStyle());

        System.out.println(new Name("Doe",null, "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Doe","", "John", null).concatNameWesternStyle());
        System.out.println(new Name("Doe","G.", "John", null).concatNameWesternStyle());

    }
}
