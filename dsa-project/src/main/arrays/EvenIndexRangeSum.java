public class EvenIndexRangeSum {
    // Precompute prefix sum for even indices
    /**
     * You are given an integer array A of length N.
     * You have to find the sum of all elements at even indices in the range [L, R].
     * 
     * @param A
     * @param B
     * @return
     */
    public static int[] evenPrefixSum(int[] A) {
        int n = A.length;
        int[] evenSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            evenSum[i + 1] = evenSum[i];
            if (i % 2 == 0) {
                evenSum[i + 1] += A[i];
            }
        }
        return evenSum;
    }

    // Answer queries using the prefix sum
    public static int[] evenIndexRangeSums(int[] A, int[][] B) {
        int[] evenSum = evenPrefixSum(A);
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0], R = B[i][1];
            result[i] = evenSum[R + 1] - evenSum[L];
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[][] B = {{0, 3}, {2, 5}, {1, 4}};
        int[] res = evenIndexRangeSums(A, B);
        for (int sum : res) {
            System.out.println(sum);
        }
        // Output: 4, 8, 8
    }
}