package methodpass.troppers;

public class Tropper {

    private String name;
    private Position position;

    public Tropper(String name) {
        if (isInValid(name)) {
            throw new IllegalArgumentException("Name can not be empty");
        }
        this.name = name;
        this.position = new Position(0.0, 0.0);
    }

    private boolean isInValid(String text) {
        return text == null || text.isEmpty();
    }

    private void exceptionHandler(Position position,String message){
        if (position == null){
            throw new IllegalArgumentException(message);
        }
    }

    public void changePosition(Position newPosition) {
        exceptionHandler(newPosition, " You have to give position!");
        this.position = newPosition;
    }

    public double distanceFrom(Position target){
        exceptionHandler(target, "You have to give Target");
        return this.position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
