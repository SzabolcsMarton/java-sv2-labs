package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    Sales sales = new Sales();
    List<Salesperson> salespersons = new ArrayList<>();

    @BeforeEach
    void init(){
        salespersons.add(new Salesperson("Jozsi",1000,800));
        salespersons.add(new Salesperson("Pisti",600,800));
        salespersons.add(new Salesperson("Bela",700,800));
        salespersons.add(new Salesperson("Orizatriznyak",1600,800));
    }

    @Test
    void selectSalesPersonWithMaxSalesAmountTest(){
        Salesperson test = sales.selectSalesPersonWithMaxSalesAmount(salespersons);
        assertSame(salespersons.get(3),test);
    }

    @Test
    void selectSalesPersonWithFurthestAboveTargetTest(){
        Salesperson test = sales.selectSalesPersonWithFurthestAboveTarget(salespersons);
        assertSame(salespersons.get(3),test);
    }

    @Test
    void selectSalesPersonWithFurthestBelowTargetTest(){
        Salesperson test = sales.selectSalesPersonWithFurthestBelowTarget(salespersons);
        assertSame(salespersons.get(1),test);
    }

}