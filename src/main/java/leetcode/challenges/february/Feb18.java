package leetcode.challenges.february;

import practices.arrays.Input;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Feb18 {

    public static String[] findRelativeRanks(int[] arr) {
        String[] ans = new String[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> arr[b] - arr[a]);
        for (int i = 0; i < arr.length; i++) {
            pq.offer(i);
        }
        int i = 1;
        while (!pq.isEmpty()) {
            int idx = pq.poll();
            if (i > 3) {
                ans[idx] = Integer.toString(i);
            } else if (i == 1) {
                ans[idx] = "Gold Medal";
            } else if (i == 2) {
                ans[idx] = "Silver Medal";
            } else if (i == 3) {
                ans[idx] = "Bronze Medal";
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        //  System.out.println(Arrays.toString(
        findRelativeRanks(new int[]{10, 3, 8, 9, 4});
    }
}
