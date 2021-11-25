package methodpass.troppers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    @Test
    void addTropperTeset(){
        HeadQuarter hq = new HeadQuarter();
        hq.addTropper(new Tropper("Sanyi Bacsi"));

        assertEquals(1, hq.getTroppers().size());
        assertEquals("Sanyi Bacsi", hq.getTroppers().get(0).getName());
    }

    @Test
    void moveClosestTropperTest(){
        HeadQuarter hq = new HeadQuarter();
        Tropper tropperOne = new Tropper("One");
        Tropper tropperTwo = new Tropper("Two");
        Position target = new Position(4,4);

        tropperOne.changePosition(new Position(3,3));

        hq.addTropper(tropperOne);
        hq.addTropper(tropperTwo);

        hq.moveClosestTrooper(target);

        assertEquals(4,tropperOne.getPosition().getPosY(), 0.000001);
        assertEquals(4,tropperOne.getPosition().getPosY(), 0.000001);

        assertEquals(0,tropperTwo.getPosition().getPosY(), 0.000001);
        assertEquals(0,tropperTwo.getPosition().getPosY(), 0.000001);
    }

    @Test
    void moveTropperByName(){
        HeadQuarter hq = new HeadQuarter();
        Tropper tropperOne = new Tropper("One");
        Tropper tropperTwo = new Tropper("Two");

        hq.addTropper(tropperOne);
        hq.addTropper(tropperTwo);

        hq.moveTropperByName("One",new Position(2,2));

        assertEquals(2,tropperOne.getPosition().getPosX());
        assertEquals(2,tropperOne.getPosition().getPosY());

        assertEquals(0,tropperTwo.getPosition().getPosX());
        assertEquals(0,tropperTwo.getPosition().getPosY());
    }




}