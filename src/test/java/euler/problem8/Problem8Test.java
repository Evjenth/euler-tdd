package euler.problem8;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static euler.RunnerTest.MAX_RUN_TIME_MILLIS;
import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem8Test {

    Problem8 problem8;

    @BeforeEach
    void init() {
        problem8 = new Problem8();
    }

    @Test
    void run() {
        IEulerProblem iEulerProblem = problem8;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }

    @ParameterizedTest
    @CsvSource({"4,5832", "13,23514624000"})
    void largestAdjacentProduct(int digits, long expectedProduct) {
        String numberString = Problem8.problemNumberString;

        long product = problem8.largestAdjacentProduct(digits, numberString);

        assertThat(product, is(expectedProduct));


    }
}