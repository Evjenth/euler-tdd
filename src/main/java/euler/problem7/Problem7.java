package euler.problem7;

import euler.IEulerProblem;

import static euler.util.PrimeUtils.nThPrime;

public class Problem7 implements IEulerProblem {

    @Override
    public void run() {
        System.out.println(nThPrime(10_001));
    }
}
