package leetcode.challenges.february;

import java.util.ArrayList;

public class Feb19 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(16));
    }
    public static  boolean isPowerOfTwo1(int n) {
        var v = (n & (n - 1));
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwo(int n) {
        int p = power(n);
        System.out.println(p);
        return p == n;
    }
    public static int power(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i*=2) {
            list.add(i);
        }
        return list.get(list.size()-1);
    }

    public static boolean isPowerOfTwoDP(int n) {
        int[] dp = new int[n + 1];
        int p = powerDP(n, dp);
        return p == n;
    }
    private static int powerDP(int n, int[] memo) {//DP
        if (n < 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0) return memo[n];
        int p = powerDP(n / 2, memo);
        memo[n] = p * 2;
        return memo[n];
    }

    private static int powerRec(int n) {//recursion
        if (n < 0) return 0;
        else if (n == 1) return 1;
        else {
            int p = powerRec(n / 2);
            return p * 2;
        }
    }
}
