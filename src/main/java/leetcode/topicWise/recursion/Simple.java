package leetcode.topicWise.recursion;

import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {
        System.out.println(sumRec(5));
    }

    static int sumRec(int n) {
        //base case
        if (n == 0) return 0;
        //recursive case
        return n + sumRec(n - 1);
    }

    static int sumIt(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int sumMath(int n) {
        return n * (n + 1) / 2;
    }

    static int sumDP(int n, int[] dp){
        if (n == 0) return 0;
        System.out.println(Arrays.toString(dp));
        //recursive case
        dp[n] = n + sumRec(n - 1);
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
