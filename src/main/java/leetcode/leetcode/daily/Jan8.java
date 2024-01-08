package leetcode.leetcode.daily;

import java.util.Set;
import java.util.HashSet;

public class Jan8 {

    public char repeatedCharacter(String s) {
        Set<Character> chars = new HashSet<>();
        char dupe = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                dupe = s.charAt(i);
                break;
            }
            chars.add(s.charAt(i));
        }
        return dupe;
    }


    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
            } else if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    boolean isBadVersion(int version) {
        return true;
    }

}
