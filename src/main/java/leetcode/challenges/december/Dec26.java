package leetcode.challenges.december;

import java.util.HashSet;
import java.util.Set;

public class Dec26 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    //Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
    //with two pointers
    public static int removeDuplicates(int[] nums) { //1 1 2
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }


    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int h = 0;
        int max = 0;

        while (start < end) {
            int length = end - start;
            if (height[start] <= height[end]) {
                h = height[start];
                start++;
            } else if (height[start] >= height[end]) {
                h = height[end];
                end--;
            }
            max = Math.max(max, length * h);
        }
        return max;

    }


    //do not allocate an extra space, solve it with TWO POINTERS
    public static int[] twoSum(int[] numbers, int target) { //O(N)-time complexity, no extra space
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[]{-1, -1};
    }

    //using HashSet to check if contains and for nearby using sliding window:
    // when the set size bigger than k, remove the i-k
    public boolean containsNearbyDuplicate(int[] nums, int k) { //TC - O(N), SC - O(N) - using extra space for set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }


}
