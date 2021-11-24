package methodpass.troppers;

public class Position {
    private final double posX ;
    private final double posY ;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Cannot calculate distance without position");
        }
        return Math.sqrt(Math.pow(posX - position.posX, 2) + Math.pow(posY - position.posY, 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
