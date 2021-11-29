package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setWeight(1.5);
        System.out.println(fruit.getName()  + " " + fruit.getWeight());

        Grape grape = new Grape();
        grape.setType("Ugni Blanc");
        grape.setName("Grape");
        grape.setWeight(1);
        System.out.println(grape.getName() + " " + grape.getWeight() + " " + grape.getType());

        Apple apple = new Apple();
        apple.setName("Apple");
        apple.setWeight(1);
        apple.setPieces(5);
        System.out.println(apple.getName() + " " + apple.getWeight() + " " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Golden");
        goldenDelicious.setWeight(2);
        goldenDelicious.setPieces(2);
        System.out.println(goldenDelicious.getName() + " " + goldenDelicious.getWeight() +
                " " + goldenDelicious.getPieces() + " " + goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("Star");
        starking.setWeight(2);
        starking.setPieces(3);
        System.out.println(starking.getName() + " " + starking.getWeight() +
                " " + starking.getPieces() + " " + starking.getColour());

    }

}
