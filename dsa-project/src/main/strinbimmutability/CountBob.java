package main.strinbimmutability;

public class CountBob {
    // Counts occurrences of substring "bob" in the input string
    public static int countBob(String A) {
        if (A == null) return 0;
        int n = A.length();
        if (n < 3) return 0;
        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (A.charAt(i) == 'b' && A.charAt(i + 1) == 'o' && A.charAt(i + 2) == 'b') {
                count++;
            }
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(countBob("bob")); // 1
        System.out.println(countBob("bobob")); // 2
        System.out.println(countBob("abobcbbob")); // 2
        System.out.println(countBob("bbb")); // 0
    }
}
