package dsa.dynamic_programming;

public class LongestSubsequence {
    public static void main(String[] args) {
        LongestSubsequence ls = new LongestSubsequence();
//        System.out.println(ls.findLCSLength("elephant", "erepat"));
        System.out.println(ls.isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while(i < s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    private int findLCSLength(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return 0;
        }
        int c1 = 0;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            c1 = 1 + findLCSLength(s1, s2, i1+1, i2+1);
        }
        int c2 = findLCSLength(s1, s2, i1, i2+1);
        int c3 = findLCSLength(s1, s2, i1+1, i2);
        return Math.max(c1, Math.max(c2, c3));
    }


}
