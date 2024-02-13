package leetcode.challenges.february;

import java.util.Arrays;

public class Feb13 {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public void moveZeroes(int[] nums) {
        int idx = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }

        for(int i = idx; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    //Input: nums = [1,7,3,6,5,6]
    //Output: 3
    public static int pivotIndex(int[] nums) {
        int sum = 0, lSum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == lSum) return i;
            lSum += nums[i];
        }
        return -1;
    }

    //Input: nums = [1,2,3,4] // lp = 1 1 6 24, rp = ans[n]*rp = 24*1, 6*2, 2*3
    // Output: [24,12,8,6]
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length, lp = 1, rp = 1;
        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            ans[i] = lp;
            lp *= nums[i];
        }

        for (int i = N - 1; i >= 0; i--) {
            ans[i] = ans[i] * rp;
            rp *= nums[i];
        }
        return ans;
    }


    public static String firstPalindrome(String[] words) {
        String ans = "";
        for (String word : words) {
            int i = 0, n = word.length();
            while (i < n / 2) {
                if (word.charAt(i) == word.charAt(n - i - 1)) {
                    i++;
                } else break;
            }
            if (i == n / 2) {
                ans = word;
                break;
            }
        }
        return ans;
    }


}
