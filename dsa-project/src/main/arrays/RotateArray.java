public class RotateArray {
    // Rotate the array to the right by k steps
    
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new RotateArray().rotate(array, k);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}