package dsa.dynamic_programming;

import java.util.ArrayList;

public class NumberFactor {
    //Given N, find the numbers of ways to express N as a sum of 1,3,4
    public static void main(String[] args) {
        System.out.println(numbersFactorBottomUp(5));
        System.out.println(numbersFactor(5));
    }

    //top down
    private static int numbersFactor(int[] dp, int n) {
        if (n == 0 || n == 1 || n == 2) return 1;
        if (n == 3) return 2;

        if (dp[0] == 0) {
            int sp1 = numbersFactor(dp, n - 1);
            int sp2 = numbersFactor(dp, n - 3);
            int sp3 = numbersFactor(dp, n - 4);
            dp[n] = sp1 + sp2 + sp3;
        }
        return dp[n];
    }

    static int numbersFactor(int n) {
        int[] dp = new int[n + 1];
        return numbersFactor(dp, n);
    }


    //bottom up
    public static  int numbersFactorBottomUp(int n) {
        int[] dp = new int[n + 1];

        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }
        return dp[n];
    }
}
