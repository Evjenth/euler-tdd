package euler.problem12;

import euler.IEulerProblem;

import java.util.List;

import static euler.util.PrimeUtils.generatePrimes;

public class Problem12 implements IEulerProblem {

    long result;

    @Override
    public void run() {
        List<Integer> primes = generatePrimes(10_000_000);
        long num = 3;
        long counter = 3;

        int divisors = 0;

        while (divisors < 500) {
            num += counter++;
            divisors = getNumDivisors(num, primes);
        }

        result = num;


    }

    int getNumDivisors(long num, List<Integer> primes) {
        int total = 1;
        for (int prime : primes) {
            if (prime > num) {
                break;
            }
            int count = 0;
            if (num % prime == 0) {
                while (num % prime == 0) {
                    num = num / prime;
                    count++;
                }
                total = total * (count + 1);
            }
        }

        return total;
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }

}
