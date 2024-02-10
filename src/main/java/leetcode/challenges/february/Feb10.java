package leetcode.challenges.february;

import java.util.List;

public class Feb10 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    //Input: s = "hello"
    //Output: "holle"
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String v = "aeiouAEIOU";
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && v.indexOf(chars[l]) == -1) {
                l++;
            }

            while (l < r && v.indexOf(chars[r]) == -1) {
                r--;
            }

            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }

        return new String(chars);
    }


    //Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
    public boolean canPlaceFlowers(int[] f, int n) {
        int i = 0, count = 0;
        while (i < f.length) {
            if (f[i] == 0 && (i == 0 || f[i - 1] == 0) && (i == f.length - 1 || f[i + 1] == 0)) {
                f[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return false;
    }

    //Input: s = "aaa"
    //Output: 6
    //Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += countSubs(s, i, i);
            count += countSubs(s, i, i + 1);
        }
        return count;
    }

    private int countSubs(String s, int left, int right) { //aa a
        int count = 0;
        while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
            count++;

        }
        return count;
    }
}
