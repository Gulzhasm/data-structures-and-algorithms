package leetcode.challenges.february;

import java.util.Arrays;

public class Feb23 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        System.out.println(maxOperations(nums, 6));
    }
    public static int maxOperations(int[] nums, int k) {
       int i = 0, j = i+1, count = 0;
       while(j < nums.length){
            if(nums[i] + nums[j] == k){
                count++;
                nums[j] = 0; nums[i] =0;
            }
            if(j == nums.length -2){
                if(nums[i] + nums[nums.length -1] == k){
                    count++;
                } else {
                    i++;
                    j = i + 1;
                }
            }
            j++;
        }

        return count;
    }
    public int maxOperationsSort(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1, count = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                count++;
                i++;j--;
            }
            else if (sum > k)j--;
            else i++;
        }
        return count;
    }
}
