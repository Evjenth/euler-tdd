package euler.problem10;

import euler.IEulerProblem;

import java.util.List;

import static euler.util.PrimeUtils.generatePrimes;

public class Problem10 implements IEulerProblem {
    long result;

    @Override
    public void run() {
        List<Integer> primes = generatePrimes(2_000_000);
        result = primes.parallelStream().mapToLong(i -> i).sum();
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }
}
