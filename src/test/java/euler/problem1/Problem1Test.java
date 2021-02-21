package euler.problem1;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    Problem1 problem1;

    @BeforeEach
    void init() {
        problem1 = new Problem1();
    }

    @Test
    void sumNaturalNumbersMultiplesOf3And5_returns_23() {
        int result = problem1.sumMultiples(10);

        assertEquals(result, 23);
    }

    @Test
    void emptyConstructorIsFizzBuzz() {
        // multiples should be set to 3 and 5
        int result = problem1.sumMultiples(10);

        assertEquals(result, 23);
    }

    @Test
    void testRunTimeTake() {
        IEulerProblem iEulerProblem = problem1;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }

    @Test
    void assertThrowsOnNull() {
        assertThrows(IllegalArgumentException.class, () -> new Problem1((Integer[]) null));
    }
}