package euler.problem3;

import euler.IEulerProblem;

import java.util.List;
import java.util.stream.Collectors;

import static euler.util.PrimeUtils.generatePrimes;

public class Problem3 implements IEulerProblem {

    int result;

    @Override
    public void run() {
        List<Integer> list = primeFactors(600_851_475_143L);
        result = list.get(list.size() - 1);
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }


    /**
     * Finds all prime factors of number n by checking if any prime up to sqrt(n) can divide n
     *
     * @param n number to find prime factors for
     * @return list of prime factors
     */
    List<Integer> primeFactors(long n) {
        return generatePrimes((int) (Math.sqrt(n) + 1)).stream().filter(prime -> n % prime == 0).collect(Collectors.toList());
    }


}
