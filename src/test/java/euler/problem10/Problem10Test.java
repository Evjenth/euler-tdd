package euler.problem10;

import euler.IEulerProblem;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void run() {
        IEulerProblem problem = new Problem10();
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), problem::run);
    }
}