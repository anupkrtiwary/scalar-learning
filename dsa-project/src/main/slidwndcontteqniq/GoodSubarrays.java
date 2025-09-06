package main.slidwndcontteqniq;

public class GoodSubarrays {
    // Returns count of good subarrays:
    // even-length && sum < B  OR  odd-length && sum > B
    public static int countGoodSubarrays(int[] A, int B) {
        int n = A.length;
        long[] ps = new long[n + 1];
        for (int i = 0; i < n; i++) ps[i + 1] = ps[i] + A[i];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                long sum = ps[j + 1] - ps[i];
                if ((len % 2 == 0 && sum < B) || (len % 2 == 1 && sum > B)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 5;
        // Subarrays:
        // [1] sum=1 len=1 odd -> 1>5? no
        // [1,2] sum=3 len=2 even -> 3<5 yes
        // ...
        System.out.println(countGoodSubarrays(A, B)); // prints the count
    }
}