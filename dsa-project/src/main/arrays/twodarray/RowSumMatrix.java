import java.util.Arrays;
package src.main.arrays.twodarray;
public class RowSumMatrix {
    public static int[] rowSums(int[][] A) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] rowSums = rowSums(A);
        System.out.println(Arrays.toString(rowSums)); // Output: [6, 15, 24]
    }
}