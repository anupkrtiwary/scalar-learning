package main.strinbimmutability;

public class StringTransformation {
    // Applies the operations in order:
    // 1) Concatenate the string with itself
    // 2) Delete all uppercase letters
    // 3) Replace each vowel (a,e,i,o,u) with '#'
    public static String transform(String A) {
        if (A == null) return null;
        String s = A + A; // concatenate with itself
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) continue; // delete uppercase
            // lowercase letters only now (original lowercase remain lowercase)
            if (isVowel(c)) sb.append('#');
            else sb.append(c);
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(transform("Abca")); // concatenate -> AbcaAbca, remove uppercase -> bca bca, replace vowels -> b#c b#c => "b#cb#c"
        System.out.println(transform("hello")); // "h#llh#ll"
        System.out.println(transform("ACbd")); // uppercase removed => bd bd => "bdbd"
    }
}
