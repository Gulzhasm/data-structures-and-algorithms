package leetcode.leetcode.daily;

import java.util.Arrays;

public class Dec25 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};

    }

    //"ace" is a subsequence of "abcde" while "aec" is not).


    //Input: nums = [1,1,1,2,2,3]  1 1 0
    //Output: 5, nums = [1,1,2,2,3,_]
    public static int removeDuplicates(int[] nums) {
        int fast = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[fast - 2] != nums[i]) {
                nums[fast++] = nums[i];
            }
        }

        return fast;
    }


    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) { // 2 3 3
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
