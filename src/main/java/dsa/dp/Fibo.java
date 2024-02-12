package dsa.dp;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(powerOf2(64));
    }

   static int powerOf2(int n){//O(logN)
        if(n <0) return 0;
        else if(n == 1) return 1;
        else {
            int prev = powerOf2(n/2);
            int curr = prev*2;
            System.out.println(curr);
            return curr;
        }
    }

    int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    int fiboDP(int n, int[] memo) {//O(N)?
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0) return memo[n];
        memo[n] = fiboDP(n - 1, memo) + fiboDP(n - 2, memo);
        return memo[n];
    }
}
