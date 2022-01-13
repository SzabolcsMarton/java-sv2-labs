package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman = new Postman();

    @BeforeEach
    void init() {
        postman.addAddress("aaa");
        postman.addAddress("bbb");
    }

    @Test
    void addAddressTest() {
        postman.addAddress("ccc");

        assertEquals(3, postman.getAddresses().size());
        assertEquals("ccc", postman.getAddresses().get(2));
        assertTrue(postman.addresses.contains("ccc"));
    }

    @Test
    void removeAddressTest() {
    postman.removeAddress("bbb");

    assertEquals(1,postman.getAddresses().size());
    assertFalse(postman.addresses.contains("bbb"));
    }


}