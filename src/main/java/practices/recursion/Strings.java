package practices.recursion;

public class Strings {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ababa"));
    }

    static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    static String reverseString(String str) {
        int n = str.length();
        if (n <= 1) {
            return str;
        }
        char left = str.charAt(0), right = str.charAt(n - 1);
        String sub = str.substring(1, n - 1);
        return right + reverseString(sub) + left;
    }
}
