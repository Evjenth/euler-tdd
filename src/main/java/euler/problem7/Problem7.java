package euler.problem7;

import euler.IEulerProblem;

import static euler.util.PrimeUtils.nThPrime;

public class Problem7 implements IEulerProblem {

    int result;

    @Override
    public void run() {
        result = nThPrime(10_001);

    }

    @Override
    public void printResult() {
        System.out.println(result);
    }
}
