package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery;

    @BeforeEach
    void init() {
        List<Sapling> saplings = new ArrayList<>();
        saplings.add(new Sapling("a", 150));
        saplings.add(new Sapling("b", 180));
        saplings.add(new Sapling("c", 160));
        saplings.add(new Sapling("d", 190));
        saplings.add(new Sapling("b", 190));

        treeNursery = new TreeNursery(saplings);
    }



    @Test
    void pruneTest() {
        treeNursery.prune(170);

        assertEquals(170, treeNursery.getSaplings().get(1).getHeight());
        assertEquals(160, treeNursery.getSaplings().get(2).getHeight());



    }

    @Test
    void sellTest() {
        treeNursery.sell("b", 185);

        assertEquals(4, treeNursery.getSaplings().size());
        assertEquals("b",treeNursery.getSaplings().get(1).getSpecies());
    }
}