package interfaceextends.robotok;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements  FlyableRobot{

    public final static long ALTITUDE = 5;
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public void flyTo(Point position ){
        this.position = position;
        path.add(position);

    }

    @Override
    public void liftTo(long altitude) {
        Point newPoz = new Point((position.getX()), position.getY(), altitude);
        this.position = newPoz;
        path.add(newPoz);

    }

    @Override
    public void moveTo(Point position) {
        this.position = position;

    }

    @Override
    public void fastMoveTo(Point position) {
        Point flyingPosition = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        flyTo(flyingPosition);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;

    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
