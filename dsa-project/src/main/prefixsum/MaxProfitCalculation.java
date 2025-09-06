 public class MaxProfitCalculation {

   
    // Function to calculate the maximum profit from stock prices
 public static int maxProfit(int[] A) {
        if (A == null || A.length == 0) return 0;
        int minPrice = A[0];
        int maxProfit = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else {
                maxProfit = Math.max(maxProfit, A[i] - minPrice);
            }
        }
        return maxProfit;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        constructPrefixSum(A);
        for (int num : A) {
            System.out.print(num + " "); // Output: 1 3 6 10 15
        }
        System.out.println();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}