package leetcode.topicWise.graph.practises;

import java.util.*;

public class GraphQuestions {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsSameConsecDiffBFS(3, 7)));
    }

    public static int[] numsSameConsecDiffBFS(int n, int k) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 9; i++) {
            q.offer(i);
        }

        int len = 1; // level

        while (!q.isEmpty() && len < n) {
            len++;
            int s = q.size();
            for (int i = 0; i < s; i++) {
                int curr = q.remove();
                int lastDigit = curr % 10;
                if (lastDigit + k <= 9) q.add(curr * 10 + lastDigit + k); // 10+1+7 18 29 70 81 90
                if (k != 0 && lastDigit - k >= 0) q.add(curr * 10 + lastDigit - k);
            }
        }

        while (!q.isEmpty()) {
            res.add(q.remove());
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }


    public int[] numsSameConsecDiffDFS(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n - 1, k, res);
        }


        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void dfs(int num, int n, int k, List<Integer> res) {
        //base case
        if (n == 0) {
            res.add(num);
            return;
        }
        int lastDigit = num % 10;
        if (lastDigit + k <= 9) dfs(num * 10 + lastDigit + k, n - 1, k, res);
        if (k != 0 && lastDigit - k >= 0) dfs(num * 10 + lastDigit - k, n - 1, k, res);
    }
}
