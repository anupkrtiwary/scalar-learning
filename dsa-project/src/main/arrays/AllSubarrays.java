public class AllSubarrays {
    // Method to generate all subarrays of an array
public int[][] allSubarrays(int[] A) {
    int n = A.length;
    int total = n * (n + 1) / 2;
    int[][] result = new int[total][];
    int idx = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int[] sub = new int[j - i + 1];
            for (int k = i; k <= j; k++) {
                sub[k - i] = A[k];
            }
            result[idx++] = sub;
        }
    }
    return result;
}



    // Example usage
    public static void main(String[] args) {
        AllSubarrays as = new AllSubarrays();
        int[] A = {1, 2, 3};
        int[][] subarrays = as.allSubarrays(A);
        for (int[] sub : subarrays) {
            for (int num : sub) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // Output: 
        // 1 
        // 1 2 
        // 1 2 3 
        // 2 
        // 2 3 
        // 3 
    }
}