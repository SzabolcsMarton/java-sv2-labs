package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWithTest(){
        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("asztal", "kipufugo", "gumiabroncs", "labda", "kisauto", "guriga");

        assertEquals(2,prefix.getWordsStartWith(words,"gu").size());
        assertSame("gumiabroncs", prefix.getWordsStartWith(words, "gu").get(0));
        assertTrue(prefix.getWordsStartWith(words, "gu").contains("gumiabroncs"));
    }

}