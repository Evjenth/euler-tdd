package euler.problem12;

import euler.IEulerProblem;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static euler.util.PrimeUtils.generatePrimes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem12Test {

    @Test
    void getNumDivisors() {
        List<Integer> primes = generatePrimes(30);
        Problem12 problem12 = new Problem12();

        int result = problem12.getNumDivisors(28, primes);

        assertEquals(6, result);
    }

    @Test
    void run() {
        IEulerProblem problem = new Problem12();
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), problem::run);
    }
}
