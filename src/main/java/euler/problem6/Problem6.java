package euler.problem6;

import euler.IEulerProblem;

import java.util.stream.IntStream;

public class Problem6 implements IEulerProblem {
    int result;

    @Override
    public void run() {
        result = sumSquareDifference(100);

    }

    @Override
    public void printResult() {
        System.out.println(result);
    }

    int sumSquares(int n) {
        return IntStream.rangeClosed(1, n).map(i -> i * i).sum();
    }

    int squareSum(int n) {
        int sum = IntStream.rangeClosed(1, n).sum();
        return sum * sum;
    }

    int sumSquareDifference(int n) {
        return squareSum(n) - sumSquares(n);
    }


}
