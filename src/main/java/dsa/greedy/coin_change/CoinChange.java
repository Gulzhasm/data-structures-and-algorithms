package dsa.greedy.coin_change;


import java.util.Arrays;

public class CoinChange {
    static void coinChange(int[] coins, int amount){  //O(NlogN)
        Arrays.sort(coins); //O(NlogN)
        int last = coins.length-1;

        do {
            //getting the last element as it is already sorted, the last element is the greatest
            int coinValue = coins[last];
            last--;
            int maxAmount = (amount / coinValue) * coinValue;
            if (maxAmount > 0) {
                System.out.println("coin value: " + coinValue + " taken count " + amount / coinValue);
                amount = amount - maxAmount;
            }
        } while (amount != 0);
    }
}
