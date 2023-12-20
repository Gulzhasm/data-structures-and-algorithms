package leetcode.leetcode.daily;

public class Dec20 {

    /*
Input: s = "2-5g-3-J", k = 2
Output: "2-5G-3J"
Explanation: The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
Input: s = "5F3Z-2e-9-w", k = 4
Output: "5F3Z-2E9W"
     */

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 3));
        //5 F 3 Z  2 e 9 w
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder builder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (builder.length() % (k + 1) == k) // this was new to me and never knew
                    builder.append('-');
                builder.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        return builder.reverse().toString();
    }
}
