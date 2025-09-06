public class ToggleCase {
    public static String toggleCase(String A) {
        if (A == null) return null;
        StringBuilder sb = new StringBuilder(A.length());
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("HelloWorld")); // hELLOwORLD
        System.out.println(toggleCase("aBcD"));       // AbCd
    }
}