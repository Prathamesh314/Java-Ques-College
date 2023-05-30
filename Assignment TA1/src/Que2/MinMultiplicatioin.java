package Que2;

public class MinMultiplicatioin {

    public int findMinMultiplications(int n) {
        if (n <= 1) {
            return 0; // No multiplications needed for 0 or 1
        }

        int minMultiplications = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int multiplications = countMultiplications(i, n);
            minMultiplications = Math.min(minMultiplications, multiplications);
        }

        return minMultiplications;
    }

    private static int countMultiplications(int base, int exponent) {
        if (exponent == 0) {
            return 0;
        } else if (exponent % 2 == 0) {
            int halfExp = countMultiplications(base, exponent / 2);
            return halfExp +2; // Multiply by base*base
        } else {
            int halfExp = countMultiplications(base, (exponent - 1) / 2);
            return halfExp + 1; // Multiply by base*base and then base
        }
    }
}