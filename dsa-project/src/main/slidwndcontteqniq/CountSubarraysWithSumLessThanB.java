package main.slidwndcontteqniq;

public class CountSubarraysWithSumLessThanB {
    // Returns number of subarrays with sum strictly less than B
    public static int countSubarrays(int[] A, int B) {
        int n = A.length;
        long sum = 0;
        long count = 0;
        int end = 0;
        for (int start = 0; start < n; start++) {
            while (end < n && sum + A[end] < B) {
                sum += A[end++];
            }
            count += (end - start);
            if (end == start) {
                // move both pointers forward if window is empty
                end++;
            } else {
                sum -= A[start];
            }
        }
        return (int) count;
    }

    // Example
    public static void main(String[] args) {
        int[] A = {2, 1, 3};
        int B = 5;
        System.out.println(countSubarrays(A, B)); // prints 4
    }
}