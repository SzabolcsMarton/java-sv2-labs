package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    NameServer nameServer;
    String name = "Hostname-One";
    String otherName = "Host-Two";
    String invalidName = "Invalid";
    String ip1 = "1";
    String ip2 = "2";
    String ip3 = "Invalid";


    @BeforeEach
    void init() {
        nameServer = new NameServer();
        nameServer.addEntry(name, ip1);
        nameServer.addEntry(otherName, ip2);

    }

    @Test
    void addEntryNameExistsShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry(name,ip3));
        assertEquals("Already exists", exception.getMessage());
    }

    @Test
    void addEntryIpExistsShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry(invalidName, ip1));
        assertEquals("Already exists", exception.getMessage());
    }

    @Test
    void getIpByNameInvalidNameShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nameServer.getIpByName(invalidName));
        assertEquals("Element not found", exception.getMessage());
    }

    @Test
    void getIpByNameTest() {
        assertEquals(ip1, nameServer.getIpByName(name));
    }

    @Test
    void getNameByIpInvalidIpShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> nameServer.getNameByIp(ip3));
        assertEquals("Element not found", exception.getMessage());
    }

    @Test
    void getNameByIpTest() {
        assertEquals(otherName, nameServer.getNameByIp(ip2));
    }

    @Test
    void deleteEntryByNameTest() {
        nameServer.deleteEntryByName(name);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> nameServer.getIpByName(name));
        assertEquals("Element not found", exception.getMessage());
    }

    @Test
    void deleteEntryByIpTest() {
        nameServer.deleteEntryByIp(ip2);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.getNameByIp(ip2));
        assertEquals("Element not found", ex.getMessage());
    }
}