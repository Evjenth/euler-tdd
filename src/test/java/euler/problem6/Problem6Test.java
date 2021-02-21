package euler.problem6;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem6Test {
    Problem6 problem6;

    @BeforeEach
    void init() {
        problem6 = new Problem6();
    }


    @ParameterizedTest
    @CsvSource({"1,1", "2,5", "3,14", "4,30", "5,55", "6,91", "10,385"})
    void sumSquares10_is385(int n, int expectedSum) {
        int sumSquares = problem6.sumSquares(n);

        assertThat(sumSquares, is(expectedSum));
    }


    @ParameterizedTest
    @CsvSource({"1,1", "2,9", "3,36", "4,100", "5,225", "10,3025"})
    void squareSum(int n, int expectedSquare) {
        int squaredSums = problem6.squareSum(n);

        assertThat(squaredSums, is(expectedSquare));
    }

    @ParameterizedTest
    @CsvSource({"1,0", "2,4", "3,22", "4,70", "5,170", "10,2640","100,25164150"})
    void sumSquareDifference(int n, int expectedDifference) {
        int difference = problem6.sumSquareDifference(n);

        assertThat(difference, is(expectedDifference));
    }

    @Test
    void testRunTimeTake(){
        IEulerProblem iEulerProblem = problem6;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }
}