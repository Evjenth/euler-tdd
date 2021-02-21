package euler;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class RunnerTest {

    // TODO: setup global times. Maybe each test should be enforced to run in under maxTime/2?

    @Test
    void main() {
        // This may need to be changed in the future when a lot of problems are calculated concurrently,
        // Even when problems are solved in concurrently, due to CPU/memory limitations
        assertTimeout(Duration.ofMillis(250), () -> Runner.main(null));
    }
}