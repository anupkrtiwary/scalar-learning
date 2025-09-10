package main.strinbimmutability;

public class ReverseString {
    // Reverses the input string A and returns the reversed string
    public static String reverse(String A) {
        if (A == null) return null;
        return new StringBuilder(A).reverse().toString();
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(reverse("abcd")); // dcba
        System.out.println(reverse("a")); // a
        System.out.println(reverse("hello")); // olleh
    }
}
