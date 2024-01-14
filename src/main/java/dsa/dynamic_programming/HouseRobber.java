package dsa.dynamic_programming;

public class HouseRobber {
    private int maxMoneyTopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length)
            return 0;

        if (dp[currentIndex] == 0) {
            int stealCurrent = HouseNetWorth[currentIndex] + maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 2);
            int skipCurrent = maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 1);
            dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
        }
        return dp[currentIndex];
    }
}
