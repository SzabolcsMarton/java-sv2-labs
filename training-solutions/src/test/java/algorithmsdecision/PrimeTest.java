package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeTest(){
        Prime prime = new Prime();

        assertTrue(prime.isPrime(97));
        assertTrue(prime.isPrime(13));
        assertFalse(prime.isPrime(45));
        assertFalse(prime.isPrime(60));
    }

}