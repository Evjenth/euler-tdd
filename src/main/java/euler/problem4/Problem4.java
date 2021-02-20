package euler.problem4;

import euler.IEulerProblem;

import java.util.stream.IntStream;

public class Problem4 implements IEulerProblem {
    @Override
    public void run() {
        System.out.println(findLargestPalindromeByProducts(3));
    }

    /**
     * Finds the largest possible palindrome made from the product of n digit numbers.
     *
     * @param digits must be greater than zero
     * @return largest palindrome found
     */
    int findLargestPalindromeByProducts(int digits) {
        final int lowerBound = (int) Math.pow(10, digits - 1);
        final int upperBound = (int) Math.pow(10, digits);
        return IntStream.range(lowerBound, upperBound)
                .map(n1 -> IntStream.range(n1, upperBound).map(n2 -> {
                    int product = n1 * n2;
                    return isPalindrome(product) ? product : 0;
                }).max().orElse(0))
                .max().orElse(0);

    }

    /**
     * Checks if a number is a palindrome.
     *
     * @param number to be validated
     * @return true if the number is a palindrome. otherwise false
     */
    boolean isPalindrome(int number) {
        String numberValue = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numberValue);

        return stringBuilder.reverse().toString().equals(numberValue);
    }


}
