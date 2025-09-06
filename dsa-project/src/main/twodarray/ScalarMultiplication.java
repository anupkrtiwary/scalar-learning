package main.twodarray;

import java.util.Arrays;

public class ScalarMultiplication {
    // Multiplies each element of matrix A by scalar B and returns the new matrix
    public static int[][] scalarMultiply(int[][] A, int B) {
        int n = A.length;
        int m = (n == 0) ? 0 : A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = A[i][j] * B;
            }
        }
        return res;
    }

    // Example usage / quick test
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int B = 3;
        int[][] out = scalarMultiply(A, B);
        for (int[] row : out) {
            System.out.println(Arrays.toString(row));
        }
    }
}
