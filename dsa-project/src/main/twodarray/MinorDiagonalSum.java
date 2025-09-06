public class MinorDiagonalSum {
    // Returns sum of minor diagonal (anti-diagonal) of square matrix A
    public static int sumMinorDiagonal(int[][] A) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i][n - 1 - i];
        }
        return sum;
    }

    // Example
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sumMinorDiagonal(A)); // prints 15 (3+5+7)
    }
}