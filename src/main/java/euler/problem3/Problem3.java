package euler.problem3;

import euler.IEulerProblem;

import java.util.List;
import java.util.stream.Collectors;

import static euler.util.PrimeUtils.generatePrimes;

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


}
