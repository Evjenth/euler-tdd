package euler.problem2;

import euler.IEulerProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem2 implements IEulerProblem {
    int result;

    @Override
    public void run() {
        result = sumEvenNumbers(fibonacciSequence(4_000_000));
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }

    int sumEvenNumbers(List<Integer> sequence) {
        return sequence.stream().mapToInt(i -> i).filter(i -> i % 2 == 0).sum();
    }

    List<Integer> fibonacciSequence(int maxValue) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        int n1 = 1;
        int n2 = 2;
        while (true) {
            int next = n2 + n1;
            if (next >= maxValue) {
                break;
            }

            sequence.add(next);
            n1 = n2;
            n2 = next;
        }
        return sequence;
    }


}
