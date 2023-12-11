package leetcode.assignments.strings;

public class SubStringPalindrome {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int output = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (s.length() == 1) {
            return output;
        }
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if(sb.length() > 1){
            if (sb.charAt(i) == sb.charAt(sb.length() - i - 1)) {
                count++;
            }
            }
        }
        return output + count;
    }
}
