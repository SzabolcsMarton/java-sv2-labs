package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Ristreto");
        coffee.setPrice(2000);
        System.out.println(coffee.getName() + ": " + coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Decoff");
        cappuccino.setPrice(2200);
        System.out.println(cappuccino.getName() + ": " + cappuccino.getPrice());
    }
}

// ugyanugy működik mert a coffee class-bol a 2 attributum es a getter/setter-ek a cappuccinoban is benne vannak
