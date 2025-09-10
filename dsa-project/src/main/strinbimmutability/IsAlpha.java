package main.strinbimmutability;

public class IsAlpha {
    // Returns 1 if all characters in the char array are alphanumeric [a-zA-Z0-9], else 0
    public static int isalpha(char[] A) {
        if (A == null) return 0;
        for (char c : A) {
            if (!Character.isLetterOrDigit(c)) return 0;
        }
        return 1;
    }

    // Convenience overload for String input
    public static int isalpha(String s) {
        if (s == null) return 0;
        return isalpha(s.toCharArray());
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isalpha("Abc123")); // 1
        System.out.println(isalpha("Abc 123")); // 0 (space)
        System.out.println(isalpha(new char[] {'a','Z','0','9'})); // 1
        System.out.println(isalpha(new char[] {'a','!','b'})); // 0
    }
}
