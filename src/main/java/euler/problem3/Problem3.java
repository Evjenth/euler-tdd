package euler.problem3;

import euler.IEulerProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 implements IEulerProblem {
    @Override
    public void run() {
        List<Integer> result = primeFactors(600_851_475_143L);
        System.out.println(result.get(result.size() - 1));
    }

    /**
     * Finds all prime factors of number n by checking if any prime up to sqrt(n) can divide n
     *
     * @param n number to find prime factors for
     * @return list of prime factors
     */
    List<Integer> primeFactors(long n) {
        List<Integer> primes = generatePrimes((int) (Math.sqrt(n) + 1));
        return primes.stream().filter(prime -> n % prime == 0).collect(Collectors.toList());
    }


    /**
     * Generates a list of primes in the range 2..n
     * by the method of SieveOfEratosthenes
     *
     * @param n highest possible prime in list
     * @return List of primes
     */
    List<Integer> generatePrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, Boolean.TRUE);
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        List<Integer> primeList = new ArrayList<>();
        for (int a = 2; a <= n; a++) {
            if (primes[a]) {
                primeList.add(a);
            }
        }
        return primeList;
    }


}
