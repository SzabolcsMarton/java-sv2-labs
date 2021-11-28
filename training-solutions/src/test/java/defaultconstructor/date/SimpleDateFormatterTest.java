package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    @Test
    void createSimpleDateFormatter(){

        assertEquals(CountryCode.HU,new SimpleDateFormatter().getDefaultCountryCode());
    }

    @Test
    void formatDateStringTest() {
        SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2021, 11, 28);

        assertEquals("2021-11-28", simpleDateFormatter.formatDateString(simpleDate));
    }

    @Test
    void formatDateStringByCountryCodeHuTest() {
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2021,11,8);

        assertEquals("2021-11-8",new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU,simpleDate));
        assertEquals("8-11-2021",new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US,simpleDate));
        assertEquals("11-8-2021",new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN,simpleDate));

    }
}