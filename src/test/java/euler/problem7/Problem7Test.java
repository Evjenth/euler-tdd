package euler.problem7;

import euler.IEulerProblem;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static euler.RunnerTest.MAX_RUN_TIME_MILLIS;
import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void runTestTime() {
        IEulerProblem iEulerProblem = new Problem7();
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }
}