package dsa.greedy.coin_change;

public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,10,1000};
        int amount = 2035;
        CoinChange.coinChange(coins, amount);
    }
}
