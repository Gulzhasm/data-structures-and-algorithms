package leetcode.leetcode.daily.january;

import java.util.ArrayList;

public class Jan18 {
    // solved this problem using DP with tabulation
    public int climbStairs(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (int i = 2; i <= n - 1; i++) {
            int n1 = list.get(i - 1);
            int n2 = list.get(i - 2);
            list.add(n1 + n2);
        }
        return list.get(n - 1);
    }
}
