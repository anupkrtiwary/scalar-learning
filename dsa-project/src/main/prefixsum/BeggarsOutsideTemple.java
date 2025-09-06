package main.prefixsum;

import java.util.Arrays;

public class BeggarsOutsideTemple {
    /**
     * A: number of beggars
     * B: list of operations where each row is [L, R, P] (1-based indices)
     * Returns array of final amounts in each beggar's pot (0-based)
     */
    public static int[] solve(int A, int[][] B) {
        long[] diff = new long[A + 1]; // extra slot to handle R+1 decrement
        if (B != null) {
            for (int[] op : B) {
                if (op == null || op.length < 3) continue;
                int L = op[0];
                int R = op[1];
                int P = op[2];
                // convert to 0-based
                int l = L - 1;
                int r = R - 1;
                if (l < 0) l = 0;
                if (r >= A) r = A - 1;
                diff[l] += P;
                if (r + 1 < diff.length) diff[r + 1] -= P;
            }
        }

        int[] result = new int[A];
        long running = 0;
        for (int i = 0; i < A; i++) {
            running += diff[i];
            result[i] = (int) running; // sums fit in int under constraints, but we used long for safety
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };
        System.out.println(Arrays.toString(solve(A, B))); // [10,55,45,25,25]
    }
}
