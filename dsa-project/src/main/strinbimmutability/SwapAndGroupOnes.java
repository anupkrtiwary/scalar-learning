package main.strinbimmutability;

public class SwapAndGroupOnes {
    // Returns maximum length of consecutive '1's after at most one swap between any 0 and 1
    public static int solve(String A) {
        if (A == null || A.length() == 0) return 0;
        int n = A.length();
        // Count total ones
        int totalOnes = 0;
        for (int i = 0; i < n; i++) if (A.charAt(i) == '1') totalOnes++;
        if (totalOnes == n) return n; // all ones

        // Compute lengths of consecutive ones segments
        int[] left = new int[n]; // left[i]: number of consecutive ones ending at i-1 (i.e., to the left of i)
        int count = 0;
        for (int i = 0; i < n; i++) {
            left[i] = count;
            if (A.charAt(i) == '1') count++; else count = 0;
        }

        int[] right = new int[n]; // right[i]: number of consecutive ones starting at i+1 (to the right of i)
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = count;
            if (A.charAt(i) == '1') count++; else count = 0;
        }

        int best = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int leftOnes = left[i];
                int rightOnes = right[i];
                int combined = leftOnes + rightOnes;
                // If there exists at least one extra '1' elsewhere to swap into this zero
                if (combined < totalOnes) combined += 1;
                if (combined > best) best = combined;
            }
        }

        return best;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(solve("1110")); // 3 (can swap but total ones=3)
        System.out.println(solve("1101100111")); // example
        System.out.println(solve("0000")); // 0
        System.out.println(solve("1")); //1
        System.out.println(solve("101")); //2 (swap to make 11)
    }
}
