package main.sildwndconteqniq;

public class MinSwapsTogether {
    // Function to find minimum swaps to bring all <= B together
    public static int minSwaps(int[] A, int B) {
        int n = A.length;
        // Count elements <= B
        int count = 0;
        for (int num : A) {
            if (num <= B) count++;
        }
        if (count == 0 || count == n) return 0;

        // Find max number of <= B in any window of size 'count'
        int good = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] <= B) good++;
        }
        int maxGood = good;
        for (int i = count; i < n; i++) {
            if (A[i - count] <= B) good--;
            if (A[i] <= B) good++;
            maxGood = Math.max(maxGood, good);
        }
        // Minimum swaps = count - maxGood
        return count - maxGood;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        System.out.println(minSwaps(A, B)); 
    }
}