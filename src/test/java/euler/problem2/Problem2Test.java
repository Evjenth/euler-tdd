package euler.problem2;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem2Test {

    Problem2 problem2;

    @BeforeEach
    void init() {
        problem2 = new Problem2();
    }


    @Test
    public void sequence() {
        List<Integer> actual = problem2.fibonacciSequence(90);
        Integer[] expected = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        assertThat(actual, contains(expected));
    }

    @Test
    public void sumEvenNumbers() {
        List<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(0);
        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(3);
        someNumbers.add(4);
        someNumbers.add(5);
        int sumEvenNumbers = problem2.sumEvenNumbers(someNumbers);
        assertThat(sumEvenNumbers, is(6));
    }

    @Test
    void testRunTimeTake() {
        IEulerProblem iEulerProblem = problem2;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }
}