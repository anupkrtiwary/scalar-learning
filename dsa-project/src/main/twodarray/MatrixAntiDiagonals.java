package main.arrays.twodarray;

public class MatrixAntiDiagonals {
    public static int[][] getAntiDiagonals(int[][] A) {
        int N = A.length;
        int total = 2 * N - 1;

        // Each anti-diagonal can have up to N elements
        int[][] result = new int[total][];
        
        for (int d = 0; d < total; d++) {
            int row = d < N ? 0 : d - N + 1;
            int col = d < N ? d : N - 1;

            // The size of each anti-diagonal is Math.min(d + 1, 2*N - 1 - d)
            int len = Math.min(d + 1, 2 * N - 1 - d);
            result[d] = new int[N];

            for (int i = 0; i < len; i++) {
                result[d][i] = A[row + i][col - i];
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

        int[][] antiDiagonals = getAntiDiagonals(A);

        for (int[] row : antiDiagonals) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
