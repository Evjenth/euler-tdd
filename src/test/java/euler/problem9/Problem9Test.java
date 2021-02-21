package euler.problem9;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static euler.RunnerTest.MAX_RUN_TIME_MILLIS;
import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {

    Problem9 problem9;

    @BeforeEach
    void init() {
        problem9 = new Problem9();
    }

    @Test
    void isPythagoreanTriplet() {
        boolean isTriplet = problem9.isPythagoreanTriplet(3, 4, 5);
        boolean isNotTriplet = problem9.isPythagoreanTriplet(1, 10, 12);

        assertTrue(isTriplet);
        assertFalse(isNotTriplet);
    }

    @Test
    void findsTripletWithExactPerimeter_1000() {
        int perimeter = 1000;
        Integer[] expectedTriplet = {200, 375, 425};

        List<Integer[]> triplets = problem9.tripletWithExactPerimeter(perimeter);

        assertThat(triplets.size(), is(1));
        assertThat(triplets.get(0), is(expectedTriplet));
    }

    @Test
    void findsTripletWithExactPerimeter_12() {
        int perimeter = 12;
        Integer[] expectedTriplet = {3, 4, 5};

        List<Integer[]> triplets = problem9.tripletWithExactPerimeter(perimeter);

        assertThat(triplets.size(), is(1));
        assertThat(triplets.get(0), is(expectedTriplet));
    }

    @Test
    void findsTripletWithExactPerimeter_WhenNoFound_returnsEmptyList(){
        int perimeter = 38;

        List<Integer[]> triplets = problem9.tripletWithExactPerimeter(perimeter);

        assertThat(triplets.size(), is(0));
    }

    @Test
    void runsWithinTime() {
        IEulerProblem iEulerProblem = problem9;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }
}