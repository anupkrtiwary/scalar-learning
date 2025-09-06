package main.arrays;

import java.util.Arrays;

public class PlusOne {
    // Adds one to the number represented by array of digits A (most significant digit first)
    // Removes any leading zeros in the output.
    public static int[] plusOne(int[] A) {
        if (A == null || A.length == 0) return new int[] {1};
        int n = A.length;
        // Work on a copy to avoid modifying caller's array
        int[] digits = Arrays.copyOf(A, n);
        int carry = 1;
        for (int i = n - 1; i >= 0 && carry > 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        int[] result;
        if (carry > 0) {
            // need one more digit at front
            result = new int[n + 1];
            result[0] = carry; // carry will be 1
            System.arraycopy(digits, 0, result, 1, n);
        } else {
            result = digits;
        }

        // Remove leading zeros from result (but keep at least one digit)
        int idx = 0;
        while (idx < result.length - 1 && result[idx] == 0) idx++;
        if (idx == 0) return result;
        return Arrays.copyOfRange(result, idx, result.length);
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,3}))); // [1,2,4]
        System.out.println(Arrays.toString(plusOne(new int[] {0,0,1,2,3}))); // [1,2,4]
        System.out.println(Arrays.toString(plusOne(new int[] {9,9,9}))); // [1,0,0,0]
        System.out.println(Arrays.toString(plusOne(new int[] {0,0,0}))); // [1]
    }
}
