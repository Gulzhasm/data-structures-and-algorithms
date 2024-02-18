package leetcode.challenges.february;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Feb18 {
    public static void main(String[] args) {
        //  System.out.println(Arrays.toString(
        System.out.println(Arrays.toString(numberGame(new int[]{5,4,2,3})));
    }
    public static int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
        }
        int i =0;
        while(!pq.isEmpty()){
            int a = pq.poll();
            int b = pq.poll();
            ans[i++] = b;
            ans[i++] = a;
        }
        return ans;
    }

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


}
