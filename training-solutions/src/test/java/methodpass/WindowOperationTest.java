package methodpass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {
    WindowOperation windowOperation = new WindowOperation();


    @Test
    void resizeTest(){
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("konyha",90, 120));
        windows.add(new Window("konyha",90, 100));
        windows.add(new Window("konyha",90, 110));

        windowOperation.riseSize(windows, 15);

        assertEquals(135, windows.get(0).getHeight());
        assertEquals(125, windows.get(2).getHeight());
    }

}