package euler.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static euler.util.PrimeUtils.generatePrimes;
import static java.time.Duration.ofMillis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class PrimeUtilsTest {

    /**
     * Generate primes up to 50. Validate against known array
     */
    @Test
    void generatePrimesTest() {
        List<Integer> primes = generatePrimes(50);

        Integer[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        assertThat(primes, contains(expected));
    }

    /**
     * Validate that generating all primes below 1_000_000 takes less than 50 milliseconds
     */
    @Test
    void generatePrime_isFast() {
        assertTimeout(ofMillis(100), () -> {
            generatePrimes(1_000_000);
        });
    }

    @ParameterizedTest
    @CsvSource({"6,13", "2,3", "3,5", "4,7", "5,11", "10001,104743", "1000001,15485867"})
    void nThPrimeTest(int n, int expectedPrime) {
        int nThPrime = PrimeUtils.nThPrime(n);

        assertThat(nThPrime, is(expectedPrime));
    }
}