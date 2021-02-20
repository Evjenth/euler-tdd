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

}
