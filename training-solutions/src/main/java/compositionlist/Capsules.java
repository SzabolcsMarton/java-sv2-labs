package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colours = new ArrayList<>();

    public void addLast(String colorToAdd) {
        colours.add(colorToAdd);
    }

    public void addFirst(String colorToAdd){
        colours.add(0, colorToAdd);
    }

    public void removeLast(){
        colours.remove(colours.size() - 1);

    }

    public  void removeFirst() {
        colours.remove(0);
    }
    public  List<String> getColours() {
        return colours;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        capsules.colours.add("Blue");
        capsules.colours.add("Yellow");
        capsules.colours.add("Green");
        capsules.colours.add("Red");

        System.out.println(capsules.colours.toString());
        capsules.addFirst("Black");
        System.out.println(capsules.colours.toString());
        capsules.addLast("Black");
        System.out.println(capsules.colours.toString());
        capsules.removeFirst();
        System.out.println(capsules.colours.toString());
        capsules.removeLast();
        System.out.println(capsules.colours.toString());
    }

}
