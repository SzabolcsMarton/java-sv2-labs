package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private final int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path){

        List<String> amountsOfAid =new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for(String actual : lines){
                String[] parts = actual.split(" ");
                int aidPerPerson = this.amount / Integer.parseInt(parts[1]);
                amountsOfAid.add(parts[0] + " " + aidPerPerson);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException | IOException exep) {
            throw new IllegalStateException("Counting problem occurred", exep);
        }
        return amountsOfAid;
    }
}
