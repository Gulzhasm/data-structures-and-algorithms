package leetcode.early.easy;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2}; // 2 3 5 4 1 7
        System.out.println(Arrays.toString(shuffle(arr, 2)));
    }

    static int[] shuffle(int[] nums, int n) {

        int temp = 0;
        int temp2 = 0;

        for (int i = 1; i < nums.length / 2; i++) {
            temp = nums[2 * i - 1];
            temp2 = nums[i + 1];

            nums[2 * i - 1] = nums[n];
            nums[i + 1] = temp;

            nums[n] = nums[n + 1];
            nums[n + 1] = temp2;

        }

        return nums;
    }
}
