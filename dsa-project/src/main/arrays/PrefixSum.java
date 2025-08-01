public class PrefixSum {
    private int[] prefixSum;

    public PrefixSum(int[] nums) {
        int n = nums.length;
         System.out.println(n);
        prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    // Method to answer all queries
    public int[] rangeSums(int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = sumRange(left, right);
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        int[][] B = {{1, 3}, {0, 4}, {2, 2}};
        PrefixSum ps = new PrefixSum(A);
        int[] answers = ps.rangeSums(B);
        for (int sum : answers) {
            System.out.println(sum);
        }
        // Output: 18, 30, 6
    }
}