package euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class RunnerTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> Runner.main(null));
    }
}