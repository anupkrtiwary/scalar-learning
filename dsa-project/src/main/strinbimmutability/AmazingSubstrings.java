package main.strinbimmutability;

public class AmazingSubstrings {
    private static final int MOD = 10003;

    // Returns number of amazing substrings (starting with a vowel) modulo 10003
    public static int solve(String S) {
        if (S == null || S.length() == 0) return 0;
        int n = S.length();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            if (isVowel(c)) {
                ans += (n - i);
                if (ans >= MOD) ans %= MOD;
            }
        }
        return (int)(ans % MOD);
    }

    private static boolean isVowel(char c) {
        switch (c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true;
            default:
                return false;
        }
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(solve("ABEC")); // 6
        System.out.println(solve("hello")); // vowels: e at 1 -> substrings 4 => 4
        System.out.println(solve("a")); // 1
    }
}
