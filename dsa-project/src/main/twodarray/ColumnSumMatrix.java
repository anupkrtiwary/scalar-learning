package main.arrays.twodarray;

import java.util.Arrays;

public class ColumnSumMatrix {
    public static int[] columnSums(int[][] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }

        int[] result = new int[A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[j] += A[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] colSums = columnSums(A);
        System.out.println(Arrays.toString(colSums)); // Output: [12, 15, 18]
    }
}
