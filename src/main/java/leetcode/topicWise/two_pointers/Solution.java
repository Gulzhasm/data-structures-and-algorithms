package leetcode.topicWise.two_pointers;

public class Solution {
    //Input: s = "abc", t = "ahbgdc"
    //Output: true
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();

    }

}