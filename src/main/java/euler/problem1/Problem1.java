package euler.problem1;

import euler.IEulerProblem;

import java.util.Arrays;

public class Problem1 implements IEulerProblem {

    Integer[] multiples;

    public Problem1() {
        // classic fizzbuzz
        this(3, 5);
    }

    public Problem1(Integer... multiples) {
        if (multiples == null) {
            throw new IllegalArgumentException();
        }
        this.multiples = Arrays.stream(multiples).filter(multiple -> multiple != 0).toArray(Integer[]::new);
    }

    @Override
    public void run() {
        int result = sumMultiples(1000);
        System.out.println(result);
    }


    public int sumMultiples(int i) {
        int sum = 0;
        for (int a = 1; a < i; a++) {
            int finalA = a;
            if (Arrays.stream(multiples).anyMatch(multiple -> finalA % multiple == 0)) {
                sum += a;
            }
        }
        return sum;
    }
}
