package euler.problem4;

import euler.IEulerProblem;

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
        int largestPalindrome = Integer.MIN_VALUE;
        int lowerBound = (int) Math.pow(10, digits - 1);
        int upperBound = (int) Math.pow(10, digits);
        for (int n1 = lowerBound; n1 < upperBound; n1++) {
            for (int n2 = n1; n2 < upperBound; n2++) {
                int product = n1 * n2;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
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
