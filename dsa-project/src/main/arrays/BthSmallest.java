public class BthSmallest {

    /**
     * Finds the B-th smallest element in the array A.
     * 
     * @param A the input array
     * @param B the index of the smallest element to find (1-based index)
     * @return the B-th smallest element in A
     */
    public static int bthSmallest(int[] A, int B) {
        for (int i = 0; i < B; i++) {
            int minIdx = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap only if needed
            if (minIdx != i) {
                int temp = A[i];
                A[i] = A[minIdx];
                A[minIdx] = temp;
            }
        }
        return A[B - 1];
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {7, 2, 5, 3, 1};cls
        int B = 3;
        System.out.println(bthSmallest(A, B)); // Output: 3
    }
}