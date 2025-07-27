public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}