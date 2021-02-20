package euler.problem3;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

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
     * Assert that prime factors are correct for a known test case
     */
    @Test
    void primeFactors() {
        List<Integer> primeFactors = problem3.primeFactors(13195L);

        Integer[] expected = {5, 7, 13, 29};

        assertThat(primeFactors, contains(expected));
    }

    @Test
    void testRunTimeTake() {
        IEulerProblem iEulerProblem = problem3;
        assertTimeout(Duration.ofMillis(50), iEulerProblem::run);
    }


}