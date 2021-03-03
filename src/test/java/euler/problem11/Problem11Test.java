package euler.problem11;

import euler.IEulerProblem;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Problem11Test {

    @Test
    void largestProductVerticalIsCorrect() {
        int[][] grid = {{1, 3}, {0, 6}};
        Problem11 problem11 = new Problem11();

        long largestProduct = problem11.largestProductOfAdjacentNumbers(grid, 2);

        assertEquals(18, largestProduct);


    }

    @Test
    void largestProductHorizontalIsCorrect() {
        int[][] grid = {{6, 3}, {0, 1}};
        Problem11 problem11 = new Problem11();

        long largestProduct = problem11.largestProductOfAdjacentNumbers(grid, 2);

        assertEquals(18, largestProduct);


    }


    @Test
    void largestProductDiagonallyDownRightIsCorrect() {
        int[][] grid = {
                {6, 3},
                {3, 4}};
        Problem11 problem11 = new Problem11();

        long largestProduct = problem11.largestProductOfAdjacentNumbers(grid, 2);

        assertEquals(24, largestProduct);


    }


    @Test
    void largestProductDiagonallyDownLeftIsCorrect() {
        int[][] grid = {
                {0, 3},
                {3, 0}};
        Problem11 problem11 = new Problem11();

        long largestProduct = problem11.largestProductOfAdjacentNumbers(grid, 2);

        assertEquals(9, largestProduct);


    }

    @Test
    void run() {
        IEulerProblem problem = new Problem11();
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), problem::run);
    }
}