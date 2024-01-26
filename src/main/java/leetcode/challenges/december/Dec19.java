package leetcode.challenges.december;

public class Dec19 {
    public static void main(String[] args) {
        // System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
        //System.out.println(distinctWord("the quick hare and the quick lion or the fast tortoise"));
        //"a", "a", "a", "aa", "aa", "aaa".
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += extractPalindrome(s, i, i);//odd length
            count += extractPalindrome(s, i, i + 1);//even length
        }
        return count;
    }

    public static int extractPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
            count++;
        }
        return count;
    }

    static String distinctWord(String words) {//O(N)
        String[] arr = words.trim().split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            if (!sb.toString().contains(s)) {
                sb.append(s).append(" ");
            }
        }
        return sb.toString();
    }

    public static int thirdMax(int[] nums) {
        Integer fm = null, sm = null, tm = null;
        for (int num : nums) {
            if (fm == null || num > fm) {
                tm = sm;
                sm = fm;
                fm = num;
            } else if (num == fm) {
                continue;
            } else if (sm == null || num > sm) {
                tm = sm;
                sm = num;
            } else if (num == sm) {
                continue;
            } else if (tm == null || num > tm) {
                tm = num;
            }
        }
        if (tm != null) {
            return tm;
        } else {
            return fm;
        }
    }
}
