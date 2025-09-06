package main.arrays.prefixsum;

 public class MaxRemovedSum {

  // Function to find the maximum possible sum of B removed elements (from either end)
    public static int maxRemovedSum(int[] A, int B) {
        int N = A.length;
        int sum = 0;
        // Take first B elements
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int maxSum = sum;
        // Try taking elements from the end instead of the front
        for (int i = 1; i <= B; i++) {
            sum = sum - A[B - i] + A[N - i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Example usage
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5

        int[] A = {5, -2, 3, 1, 2};
        int B = 3;
        System.out.println(maxRemovedSum(A, B)); // Output: 8
    }
}