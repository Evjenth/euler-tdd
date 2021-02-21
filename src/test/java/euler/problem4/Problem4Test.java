package euler.problem4;

import euler.IEulerProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static euler.RunnerTest.SINGLE_PROBLEM_MAX_RUN_TIME;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem4Test {
    Problem4 problem4;

    @BeforeEach
    void init() {
        problem4 = new Problem4();
    }

    @Test
    void isPalindrome() {
        int[] palindromes = {1, 22, 202, 33433, 19091, 80808};
        int[] notPalindromes = {13, 221, 2020, 4000, 831232};

        boolean palindromRes = Arrays.stream(palindromes).allMatch(problem4::isPalindrome);
        boolean notPalindromRes = Arrays.stream(notPalindromes).noneMatch(problem4::isPalindrome);

        assertTrue(palindromRes);
        assertTrue(notPalindromRes);
    }

    @Test
    void findLargestPalindromeByProducts() {
        int largestPalindrome = problem4.findLargestPalindromeByProducts(2);
        assertThat(largestPalindrome, is(9009));

        largestPalindrome = problem4.findLargestPalindromeByProducts(3);
        assertThat(largestPalindrome, is(906609));

    }

    @Test
    void testRunTimeTake() {
        IEulerProblem iEulerProblem = problem4;
        assertTimeout(Duration.ofMillis(SINGLE_PROBLEM_MAX_RUN_TIME), iEulerProblem::run);
    }
}