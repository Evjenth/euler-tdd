package euler.problem5;

import euler.IEulerProblem;

import java.util.ArrayList;
import java.util.List;

import static euler.util.PrimeUtils.generatePrimes;

public class Problem5 implements IEulerProblem {
    int result;

    @Override
    public void run() {
        result = smallestNumberDivisibleByAllUpto(20);

    }

    @Override
    public void printResult() {
        System.out.println(result);
    }

    /**
     * Finds the smallest number divisible by all numbers up to, and including, n
     *
     * @param n highest number to validate
     * @return smallest number dividing all numbers in range 1..n
     */
    int smallestNumberDivisibleByAllUpto(int n) {
        List<List<Integer>> primeFactorLists = new ArrayList<>();
        List<Integer> primes = generatePrimes(n);
        for (int a = 2; a <= n; a++) {
            List<Integer> factors = new ArrayList<>();
            if (primes.contains(a)) {
                factors.add(a);
            } else {
                int copy = a;
                while (copy != 1) {
                    int finalCopy = copy;
                    Integer factor = primes.stream().filter(prime -> finalCopy >= prime && finalCopy % prime == 0).findFirst().orElse(null);
                    if (factor != null) {
                        copy /= factor;
                        factors.add(factor);
                    }
                }
            }
            primeFactorLists.add(factors);
        }

        int[] resArr = new int[n + 1];
        for (List<Integer> primeFactors : primeFactorLists) {
            int[] tempArr = new int[n + 1];
            for (int factor : primeFactors) {
                tempArr[factor]++;
            }
            for (int a = 0; a < resArr.length; a++) {
                resArr[a] = Math.max(resArr[a], tempArr[a]);
            }
        }

        int product = 1;
        for (int a = 0; a < resArr.length; a++) {

            if (resArr[a] != 0) {
                for (int b = 0; b < resArr[a]; b++) {
                    product = Math.multiplyExact(product, a);
                }

            }
        }
        return product;
    }


}
