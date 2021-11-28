package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void createBikeAdvertisementwithDescriptionAndPriceTest(){
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("Csodajo bringa",20_000);

        assertEquals("Csodajo bringa",bikeAdvertisement.getDescription());
        assertEquals(20_000, bikeAdvertisement.getPrice());
        assertNull(bikeAdvertisement.getSerialNumber());
        assertNull(bikeAdvertisement.getBrand());
        assertNull(bikeAdvertisement.getExtras());
    }

    @Test
    void createBikeAdvertisementwithDescriptionPriceBrandTest(){
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("Csodajo bringa",20_000, "Scott");

        assertEquals("Csodajo bringa",bikeAdvertisement.getDescription());
        assertEquals(20_000, bikeAdvertisement.getPrice());
        assertEquals("Scott",bikeAdvertisement.getBrand());
        assertNull(bikeAdvertisement.getSerialNumber());
        assertNull(bikeAdvertisement.getExtras());
    }


    @Test
    void createBikeAdvertisementwithDescriptionPriceBrandExtrasTest(){
        List<String> extras = Arrays.asList("kormany", "nyereg", "kerek");
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Csodajo bringa",
                20_000, "Scott",
                extras);

        assertEquals("Csodajo bringa",bikeAdvertisement.getDescription());
        assertEquals(20_000, bikeAdvertisement.getPrice());
        assertEquals("Scott",bikeAdvertisement.getBrand());
        assertEquals("nyereg",bikeAdvertisement.getExtras().get(1));
        assertNull(bikeAdvertisement.getSerialNumber());
    }

    @Test
    void createBikeAdvertisementwithDescriptionPriceExtrasSerialTest(){
        List<String> extras = Arrays.asList("kormany", "nyereg", "kerek");
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Csodajo bringa",
                20_000, "Scott",
                extras,
                "12345");

        assertEquals("Csodajo bringa",bikeAdvertisement.getDescription());
        assertEquals(20_000, bikeAdvertisement.getPrice());
        assertEquals("Scott",bikeAdvertisement.getBrand());
        assertEquals("nyereg",bikeAdvertisement.getExtras().get(1));
        assertEquals("12345", bikeAdvertisement.getSerialNumber());
    }



}