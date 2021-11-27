package methodchain;

public class Grasshopper {

    private int position;

    public Grasshopper hopOnce(Direction direction) {
        if (direction == Direction.POSITIV) {
            position++;
        }
        if (direction == Direction.NEGATIV) {
            position--;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops(){
        hopOnce(Direction.POSITIV)
                .hopOnce(Direction.NEGATIV)
                .hopOnce(Direction.POSITIV)
                .hopOnce(Direction.POSITIV)
                .hopOnce(Direction.POSITIV);
    }

    public int getPosition(){
        return position;
    }

}
