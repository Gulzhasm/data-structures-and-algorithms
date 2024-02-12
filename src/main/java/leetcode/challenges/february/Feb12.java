package leetcode.challenges.february;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Feb12 {

    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }


    //Input: nums = [2,1,5,0,4,6]
    //Output: true
    //Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
    public static boolean increasingTriplet(int[] nums) {
      int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
      for(int num : nums){
          if(num <= f) f = num;
          else if(num < s) s = num;
          else if (num > s) return true;
      }
      return false;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int lp = 1;
        int rp = 1;

        for(int i = 0; i < n; i++){
            ans[i] = lp;
            lp *= nums[i];
        }

        for(int i = n-1; i >=0; i--){
            ans[i] = ans[i] * rp;
            rp*=nums[i];
        }
        return ans;
    }

}
