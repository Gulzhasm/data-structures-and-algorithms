package dsa.dynamic_programming;

import java.util.*;

public class Fibo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(fiboMemo(6, map));
        System.out.println(fiboTab(6));
    }

    public static int fiboMemo(int n, HashMap<Integer, Integer> memo) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, fiboMemo(n - 1, memo) + fiboMemo(n - 2, memo));
        }
        return memo.get(n);
    }

    public static int fiboTab(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= n - 1; i++) {
            int n1 = list.get(i - 1);
            int n2 = list.get(i - 2);
            list.add(n1 + n2);
        }
        return list.get(n - 1);
    }

}
