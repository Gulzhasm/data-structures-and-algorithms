package leetcode.leetcode.daily.january;

import java.util.Arrays;

public class Jan15 {

    public static void main(String[] args) {
        int[] arr = {555, 901, 482, 1771};
        System.out.println(findNumbers(arr));
        // System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitsCount = 0;
            int n = num;
            while (n > 0) {
                digitsCount++;
                n = n / 10;
            }
            if (digitsCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }


}