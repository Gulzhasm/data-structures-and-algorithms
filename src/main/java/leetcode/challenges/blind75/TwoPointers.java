package leetcode.challenges.blind75;

public class TwoPointers {
    //(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    //Input: s = "abc", t = "ahbgdc"
    //Output: true
    public boolean isSubsequence(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                sb.append(t.charAt(j));
                i++;
                j++;
            } else {
                j++;
            }

        }
        return s.length() == sb.length();
    }
}
