package euler.problem8;

import euler.IEulerProblem;

public class Problem8 implements IEulerProblem {
    static final String problemNumberString = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
    long result;

    @Override
    public void run() {
        result = largestAdjacentProduct(13, problemNumberString);

    }

    @Override
    public void printResult() {
        System.out.println(result);
    }

    /**
     * Finds the largest product of n adjacent digits in a string.
     *
     * @param numDigits number of adjacent digits to include
     * @param number    a string containing all digits. Can be way larger than int/long max size
     * @return The largest product by multiplying n adjacent digits
     */
    long largestAdjacentProduct(int numDigits, String number) {
        long largestProduct = 0;
        for (int a = 0; a < number.length() - numDigits; a++) {
            String subNumber = number.substring(a, a + numDigits);
            // Only check strings without a zero in it. If all string contains one or more zeroes, the initialized
            // value of largestProduct will be correctly set at 0...
            if (!subNumber.contains("0")) {
                long product = 1;
                for (char digit : subNumber.toCharArray()) {
                    long val = Character.getNumericValue(digit);
                    product = Math.multiplyExact(product, val);
                }

                if (product > largestProduct) {
                    largestProduct = product;
                }
            }


        }
        return largestProduct;
    }


}
