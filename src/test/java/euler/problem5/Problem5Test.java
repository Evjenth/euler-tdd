package euler.problem5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem5Test {

    Problem5 problem5;

    @BeforeEach
    void init() {
        problem5 = new Problem5();
    }

    @Test
    void testFindSmallestNumberDivisibleByAll() {
        int res10 = problem5.smallestNumberDivisibleByAllUpto(10);
        int res20 = problem5.smallestNumberDivisibleByAllUpto(20);
        assertThat(res10, is(2520));
        assertThat(res20, is(232792560));
    }

    @Test
    void handlesSmallNumbers() {
        int res2 = problem5.smallestNumberDivisibleByAllUpto(2);
        assertThat(res2, is(2));

        int res4 = problem5.smallestNumberDivisibleByAllUpto(4);
        assertThat(res4, is(12));
    }

    @Test
    void isFastForLargeNumber() {
        assertTimeout(ofMillis(50), () -> {
            problem5.smallestNumberDivisibleByAllUpto(2);
        });
    }

}