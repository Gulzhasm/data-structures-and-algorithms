package leetcode.assignments.arrays;

import java.util.*;

public class Hash {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        int digits = (int) Math.log10(1) + 1; //

    }


    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int potentialSum = target - nums[i];
            if (map.containsKey(potentialSum)) {
                return new int[]{map.get(potentialSum), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    public boolean isPalindrome(int x) {//12321
        List<Integer> ans = new ArrayList<>();
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int rem = x % 10;
            ans.add(rem);
            x = x / 10;
        }

        for (int i = 0; i < ans.size() / 2; i++) {
            if (!ans.get(i).equals(ans.get(ans.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }



}
