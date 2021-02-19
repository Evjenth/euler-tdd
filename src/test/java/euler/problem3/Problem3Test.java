package euler.problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.time.Duration.ofMillis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTimeout;


class Problem3Test {

    Problem3 problem3;

    @BeforeEach
    public void setup() {
        problem3 = new Problem3();
    }

    /**
     * Generate primes up to 50. Validate against known array
     */
    @Test
    void generatePrimes() {
        List<Integer> primes = problem3.generatePrimes(50);

        Integer[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        assertThat(primes, contains(expected));
    }

    /**
     * Validate that generating all primes below 1_000_000 takes less than 50 milliseconds
     */
    @Test
    void generatePrime_isFast() {
        assertTimeout(ofMillis(50), () -> {
            problem3.generatePrimes(1_000_000);
        });
    }

    /**
     * Assert that prime factors are correct for a known test case
     */
    @Test
    void primeFactors() {
        List<Integer> primeFactors = problem3.primeFactors(13195L);

        Integer[] expected = {5, 7, 13, 29};

        assertThat(primeFactors, contains(expected));
    }


}