package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void createRoomTest(){
        Room room = new Room("Foldszint", 30);

        assertEquals(30, room.getCapacity());
        assertEquals("Foldszint", room.getLocation());
    }


}