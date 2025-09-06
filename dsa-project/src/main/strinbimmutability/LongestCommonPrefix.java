package main.strinbimmutability;

public class LongestCommonPrefix {
    // Returns the longest common prefix among all strings in arr
    // Time: O(total length of strings), Space: O(1) extra
    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) return "";
        // find the minimum length
        int minLen = Integer.MAX_VALUE;
        for (String s : arr) {
            if (s == null) return ""; // treat null as no common prefix
            minLen = Math.min(minLen, s.length());
        }
        if (minLen == 0) return "";

        StringBuilder sb = new StringBuilder(minLen);
        for (int i = 0; i < minLen; i++) {
            char c = arr[0].charAt(i);
            boolean allMatch = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) != c) {
                    allMatch = false;
                    break;
                }
            }
            if (!allMatch) break;
            sb.append(c);
        }
        return sb.toString();
    }

    // Example usage
    public static void main(String[] args) {
        String[] a1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a1)); // "fl"

        String[] a2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(a2)); // ""

        String[] a3 = {"","abc"};
        System.out.println(longestCommonPrefix(a3)); // ""
    }
}
