package euler.problem7;

import euler.IEulerProblem;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void runTestTime() {
        IEulerProblem iEulerProblem = new Problem7();
        assertTimeout(Duration.ofMillis(100), iEulerProblem::run);
    }
}