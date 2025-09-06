package main.slidwndcontteqniq;

public class LeastAverageSubarray {
    // Function to count number of subarrays with sum less than B
    public static int countSubarraysWithSumLessThanB(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += A[end];
                if (sum < B) {
                    count++;
                } else {
                    break; // No need to continue, sum will only increase
                }
            }
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {2, 1, 3};
        int B = 5;
        System.out.println(countSubarraysWithSumLessThanB(A, B)); // Output: 4
    }
}
    // Example usage
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(leastAverageIndex(A, B)); // Output: 3
    }
}