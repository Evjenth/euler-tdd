package euler.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @Test
    void sumNaturalNumbersMultiplesOf3And5_returns_23() {
        Problem1 problem1 = new Problem1(3, 5);
        int result = problem1.sumMultiples(10);

        assertEquals(result, 23);
    }

    @Test
    void emptyConstructorIsFizzBuzz() {
        // multiples should be set to 3 and 5
        Problem1 problem1 = new Problem1();
        int result = problem1.sumMultiples(10);

        assertEquals(result, 23);
    }
}