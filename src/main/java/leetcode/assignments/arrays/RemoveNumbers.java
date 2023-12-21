package leetcode.assignments.arrays;

import java.util.Arrays;

public class RemoveNumbers {
    public static void main(String[] args) {
        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        //Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) { //O(N)
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
