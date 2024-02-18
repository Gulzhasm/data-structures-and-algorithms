package leetcode.challenges.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

    //Input: nums = [1,2,3], k = 3 // 1 3 6
    //Output: 2
    public static int subarraySum(int[] nums, int k){
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
        }
        return count;
    }

    public static int subarraySumBF(int[] nums, int k) {//BF -> some edge cases do not work
        int n = nums.length, count = 0;
        int[] pSum = new int[n];
        pSum[0] = nums[0];
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                pSum[i] = pSum[i - 1] + nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (pSum[i] == k) {
                count++;
            }
            int j = pSum.length - 1;
            while (j >= 0) {
                if (pSum[j] - pSum[i] == k) {
                    count++;
                }
                j--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subarraySum(nums, 3));
    }
}
