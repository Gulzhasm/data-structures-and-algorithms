package dsa.divideAndConquer;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        ZeroOneKnapsack knapsack = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        System.out.println(knapsack.zeroOne(profits, weights, 7));
    }

    public int zeroOne(int[] profits, int[] weights, int capacity) {
        return this.zeroOne(profits, weights, capacity, 0);
    }

    private int zeroOne(int[] profits, int[] weights, int capacity, int currentIndex) {
        //base condition
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) return 0;

        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + zeroOne(profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }

        int profit2 = zeroOne(profits, weights, capacity, currentIndex + 1);
        return Math.max(profit1, profit2);
    }
}
