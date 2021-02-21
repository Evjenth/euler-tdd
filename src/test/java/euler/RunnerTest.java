package euler;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class RunnerTest {

    public static int MAX_RUN_TIME_MILLIS = 1000;
    public static int SINGLE_PROBLEM_MAX_RUN_TIME = 800;

    @Test
    void main() {
        // This may need to be changed in the future when a lot of problems are calculated concurrently,
        // Even when problems are solved in concurrently, due to CPU/memory limitations
        assertTimeout(Duration.ofMillis(MAX_RUN_TIME_MILLIS), () -> Runner.main(null));
    }
}