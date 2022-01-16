package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper = new Paper();

    @BeforeEach
    void init() {
        paper.putFurtherPaper("1", 10);
        paper.putFurtherPaper("6", 15);
        paper.putFurtherPaper("1", 20);
        paper.putFurtherPaper("2", 10);
        paper.putFurtherPaper("1", 15);
        paper.putFurtherPaper("6", 20);

    }

    @Test
    void putFurtherPaperTest() {
        paper.putFurtherPaper("2", 10);

        assertEquals(20, paper.getClassPerKg().get("2"));
    }

    @Test
    void putFurtherPaperNewClassTest() {
        paper.putFurtherPaper("3", 10);

        assertEquals(10, paper.getClassPerKg().get("3"));
    }


    @Test
    void getWinnerClassTest() {
        assertEquals("1", paper.getWinnerClass());
    }


    @Test
    void getTotalWeightTest() {
        assertEquals(90, paper.getTotalWeight());
    }
}