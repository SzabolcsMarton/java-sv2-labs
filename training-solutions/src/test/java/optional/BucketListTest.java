package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList;
    List<Destination> testDestination = new ArrayList<>();

    @BeforeEach
    void init() {
        testDestination.add(new Destination("egy hely", "nagyon szep", 50));
        testDestination.add(new Destination("ket hely", "szep", 60));
        testDestination.add(new Destination("harom hely", "nagyon jo uticel", 70));
        testDestination.add(new Destination("negy hely", "csodalatos", 80));
        bucketList = new BucketList(testDestination);

    }

//    @Test
//    void getDestinationWithKeywordFoundTest() {
//        assertEquals("szep", bucketList.getDestinationWithKeyword("ket").get().getDescription());
//    }

    @Test
    void getDestinationWithKeywordFoundTest() {
        assertEquals("harom hely", bucketList.getDestinationWithKeyword("jo").get().getName());
    }
    @Test
    void getDestinationWithKeywordNotFoundTest() {
        assertEquals(Optional.empty(), bucketList.getDestinationWithKeyword("aaa"));
    }

    @Test
    void getDestinationNearerThanGivenFoundTest() {
        assertEquals("egy hely", bucketList.getDestinationNearerThanGiven(75).get().getName());
    }

    @Test
    void getDestinationNearerThanGivenNotFoundTest() {
        assertEquals(Optional.empty(), bucketList.getDestinationNearerThanGiven(40));
    }

}