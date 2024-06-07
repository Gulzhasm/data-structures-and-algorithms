package leetcode.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Majority {
    //Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
    //Example 1:
    //Input: nums = [3,2,3]
    //Output: [3]

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length/3;
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            int j = i-1;
           if(nums[i] == nums[j]) count++;
           else {
               if(count >= n){
                   ans.add(nums[i]);
                   count = 0;
               }
           }

        }
        return ans;
    }
}
