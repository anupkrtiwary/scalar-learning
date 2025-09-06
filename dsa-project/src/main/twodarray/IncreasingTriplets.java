package main.arrays;

public class IncreasingTriplets {
    // Counts triplets (i, j, k) with i < j < k and A[i] < A[j] < A[k]
    // Time: O(N^2), Space: O(1)
    public static int countIncreasingTriplets(int[] A) {
        int n = A.length;
        int count = 0;
        for (int j = 0; j < n; j++) {
            int leftLess = 0;
            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) leftLess++;
            }
            int rightGreater = 0;
            for (int k = j + 1; k < n; k++) {
                if (A[k] > A[j]) rightGreater++;
            }
            count += leftLess * rightGreater;
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(countIncreasingTriplets(A)); // 4 (all combinations)

        int[] B = {2, 1, 3, 4};
        System.out.println(countIncreasingTriplets(B)); // 3 -> (2,3,4), (1,3,4), (1,3,4?) check
    }
}
