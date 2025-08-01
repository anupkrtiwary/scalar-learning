import java.util.Arrays;

public class MinRemoveCost {
    public static long minCost(int[] A) {
        long cost = 0;
        int n = A.length;
        // Sort in ascending order to minimize cost
        Arrays.sort(A);
        // Reverse to get descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = A[i];
            A[i] = A[n - 1 - i];
            A[n - 1 - i] = temp;
        }
        // Calculate the cost of removing elements
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        for (int i = 0; i < n; i++) {
            cost += sum;
            sum -= A[i];
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] A = {8,0,10};
        System.out.println(minCost(A)); // Output: 15
    }
}
