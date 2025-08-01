public class SubarraySumTotal {
    /**
     * You are given an integer array A of length N.
     * You have to find the sum of all subarray sums of A.
     * More formally, a subarray is defined as a contiguous part of an array which
     * we can obtain by deleting zero or more elements from either end of the array.
     * A subarray sum denotes the sum of all the elements of that subarray.
     * 
     * Note : Be careful of integer overflow issues while calculations. Use
     * appropriate datatypes.
     * 
     * @param A
     * @return
     */
    public static long sumOfAllSubarraySums(int[] A) {
        int n = A.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            // Each A[i] appears in (i+1)*(n-i) subarrays
            long count = (long) (i + 1) * (n - i);
            total += (long) A[i] * count;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        System.out.println(sumOfAllSubarraySums(A)); // Output: 20
    }
}
