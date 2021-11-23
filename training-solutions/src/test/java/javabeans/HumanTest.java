package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void getAndSetNameTest() {
        Human human = new Human();
        human.setName("Sanyi Bacsi");

        assertEquals("Sanyi Bacsi", human.getName());
    }

    @Test
    void getAndSetWeightTest() {
        Human human = new Human();
        human.setWeight(58.45);

        assertEquals(58.45, human.getWeight());
    }

    @Test
    void getAndSetIqTest(){
        Human human = new Human();
        human.setIq(148);

        assertEquals(148, human.getIq());
    }

}