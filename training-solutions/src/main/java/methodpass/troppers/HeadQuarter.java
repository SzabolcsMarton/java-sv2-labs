package methodpass.troppers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Tropper> troppers = new ArrayList<>();

    public void addTropper(Tropper tropperToAdd) {
        tropperExceptionHandler(tropperToAdd);
        troppers.add(tropperToAdd);
    }

    public List<Tropper> getTroppers() {
        return troppers;
    }

    public void moveClosestTrooper(Position target) {
        positionExceptionHandler(target);
        Tropper closest = findClosestTropper(target);
        tropperExceptionHandler(closest);
        moveTropper(closest, target);
    }

    public void moveTropperByName(String name, Position target) {
        nameExceptionHandler(name);
        positionExceptionHandler(target);
        Tropper tropperToMove = findTropperByName(name);
        tropperExceptionHandler(tropperToMove);
        moveTropper(tropperToMove, target);
    }

    private void tropperExceptionHandler(Tropper tropperToCheck) {
        if (tropperToCheck == null) {
            throw new IllegalArgumentException("Yoe have to give the Tropper");
        }
    }

    private void positionExceptionHandler(Position positionToCheck) {
        if (positionToCheck == null) {
            throw new IllegalArgumentException("Yoe have to give the Position");
        }
    }

    private void nameExceptionHandler(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("You have to give the Name");
        }
    }

    private Tropper findTropperByName(String name) {
        for (Tropper actual : troppers) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    private Tropper findClosestTropper(Position target) {
        Tropper closest = troppers.get(0);
        for (Tropper actual : troppers) {
            if (closest.distanceFrom(target) > actual.distanceFrom(target)) {
                closest = actual;
            }
        }
        return closest;
    }

    private void moveTropper(Tropper tropper, Position target) {
        tropper.changePosition(target);
    }


}
