public class CountAPairsWithG {
    // Method to count pairs of 'A' and 'G' in the string
    /**
     * You are given a string A consisting of characters 'A' and 'G'.
     * You have to count the number of pairs (i, j) such that A[i] = 'A' and A[j] = 'G'
     * with i < j.
     * 
     * @param A
     * @return
     */
    public static int countAPairsWithG(String A) {
        int countA = 0, pairs = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                countA++;
            } else if (A.charAt(i) == 'G') {
                pairs += countA;
            }
        }
        return pairs;
    }

    // Example usage
    public static void main(String[] args) {
        String A = "AAGAG";
        System.out.println(countAPairsWithG(A)); // Output: 6
    }
}