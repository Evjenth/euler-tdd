package euler.problem9;

import euler.IEulerProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem9 implements IEulerProblem {
    long result;

    @Override
    public void run() {
        List<Integer[]> resList = tripletWithExactPerimeter(1000);
        Integer[] res = resList.get(0);
        result = (long) res[0] * (long) res[1] * (long) res[2];
    }

    @Override
    public void printResult() {
        System.out.println(result);
    }


    /**
     * Finds all pythagorean triplets with a given perimeter. Assumes a < b < c and no negative values
     *
     * @param perimeter sum of the triplet lengths
     * @return A list with all triplets that has the provided perimeter
     */
    List<Integer[]> tripletWithExactPerimeter(int perimeter) {
        List<Integer[]> triplets = new ArrayList<>();
        for (int c = perimeter / 3; c < perimeter; c++) {
            for (int b = 2; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (a + b + c == perimeter) {
                        if (isPythagoreanTriplet(a, b, c)) {
                            Integer[] triplet = {a, b, c};
                            triplets.add(triplet);
                        }
                    }
                }
            }
        }
        return triplets;
    }


    /**
     * Checks if numbers form a pythagorean triple, using the known rule a²+b²=c²
     *
     * @param a number
     * @param b number
     * @param c number
     * @return true if number follow the rule
     */
    boolean isPythagoreanTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }

}
