package euler.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeUtils {

    /**
     * Generates a list of primes in the range 2..n
     * by the method of SieveOfEratosthenes
     *
     * @param n highest possible prime in list
     * @return List of primes
     */
    public static List<Integer> generatePrimes(int n) {
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

    /**
     * Finds the nTh prime.
     *
     * @param n index of prime in series. 1 returns first prime (2), 4 returns 7 and so on
     * @return nth prime starting from 2 as the first prime.
     */
    public static int nThPrime(int n) {
        List<Integer> primes = generatePrimes(1000_000);

        if (primes.size() >= n) {
            return primes.get(n - 1);
        }

        // Continue from last prime and continue to add to list
        int nextNumberToCheck = primes.get(primes.size() - 1) + 2;
        while (primes.size() < n) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (prime * prime > nextNumberToCheck) {
                    break;
                }

                if (nextNumberToCheck % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(nextNumberToCheck);
            }

            nextNumberToCheck += 2;
        }

        return primes.get(n - 1);

    }


}
