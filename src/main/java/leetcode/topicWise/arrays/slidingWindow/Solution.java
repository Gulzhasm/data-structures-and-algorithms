package leetcode.topicWise.arrays.slidingWindow;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
       int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3}; int k = 19;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.get(nums[r]) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }

    public static  int numSubarrayProductLessThanK(int[] A, int k) {
        int ans = 0, j = 0, i = 0;

        while(i < A.length){
            if(A[i] < k){
                ans++;
                int prod = A[i];
                j = i + 1;
                while(j < A.length ){
                    prod *= A[j];
                    if(prod < k) {
                        ans++;
                        j++;
                    }else break;

                }
            }
            i++;
        }

        return ans;
    }
}
