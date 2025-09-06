package main.arrays;

public class MaxSubarraySum {
    // Returns maximum subarray sum (non-empty subarray)
    // Time: O(N), Space: O(1)
    public static int maxSubarray(int[] A) {
        if (A == null || A.length == 0) return 0; // define 0 for empty, though problem says N>=1
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(maxSubarray(new int[] {1, -2, 3, 4, -1, 2})); // 8 (3+4-1+2)
        System.out.println(maxSubarray(new int[] {-3, -2, -5})); // -2
        System.out.println(maxSubarray(new int[] {5})); // 5
    }
}
