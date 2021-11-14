package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        while (angle > 360) {
            angle -= 360;
        }
        while (angle < 0) {
            angle += 360;
        }
        if (angle > 80 && angle < 280) {
            throw new IllegalArgumentException("A csővet nem lehet 80 foknál jobban elforditani semelyik irányba!");
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.modifyAngle(0);
        tank.modifyAngle(-80);
        System.out.println(tank.getAngle());
    }
}