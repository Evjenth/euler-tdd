package euler.problem2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

class Problem2Test {


    @Test
    public void sequence() {
        Problem2 problem2 = new Problem2();

        List<Integer> actual = problem2.fibonacciSequence(90);
        Integer[] expected = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        assertThat(actual, contains(expected));
    }

    @Test
    public void sumEvenNumbers() {
        Problem2 problem2 = new Problem2();
        List<Integer> someNumbers = new ArrayList<>();
        someNumbers.add(0);
        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(3);
        someNumbers.add(4);
        someNumbers.add(5);

        int sumEvenNumbers = problem2.sumEvenNumbers(someNumbers);

        assertThat(sumEvenNumbers, is(6));

    }

}