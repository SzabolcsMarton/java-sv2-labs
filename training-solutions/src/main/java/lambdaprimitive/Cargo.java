package lambdaprimitive;

public class Cargo {

    private final String description;
    private final int weight;
    private final double length;

    public Cargo(String description, int weight, double length) {
        this.description = description;
        this.weight = weight;
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }
}
