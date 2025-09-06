package main.strinbimmutability;

public class LongestPalindromicSubstring {
    // Returns the longest palindromic substring. If multiple, returns the one with smallest start index.
    // Time: O(N^2), Space: O(1)
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int n = s.length();
        int bestStart = 0, bestLen = 1;
        for (int center = 0; center < n; center++) {
            // odd length
            int[] odd = expandAroundCenter(s, center, center);
            if (odd[1] > bestLen) {
                bestStart = odd[0];
                bestLen = odd[1];
            }
            // even length
            int[] even = expandAroundCenter(s, center, center + 1);
            if (even[1] > bestLen) {
                bestStart = even[0];
                bestLen = even[1];
            }
        }
        return s.substring(bestStart, bestStart + bestLen);
    }

    // expand returns {startIndex, length} of palindrome expanded from left,right
    private static int[] expandAroundCenter(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--; right++;
        }
        // now substring (left+1 .. right-1) is palindrome
        int start = left + 1;
        int len = right - left - 1;
        return new int[] {start, len};
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // expected "bab" or "aba" -> returns "bab" (earlier)
        System.out.println(longestPalindrome("cbbd")); // expected "bb"
        System.out.println(longestPalindrome("a")); // "a"
        System.out.println(longestPalindrome("ac")); // "a"
    }
}
