package leetcode.challenges.january;

import java.util.Arrays;

public class Jan24 {

    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,3};
        System.out.println(removeDuplicates( arr));

    }

    public double findMaxAverage(int[] nums, int k) {
        //1. sum till 0 to k and assign it as max
        // 2. use sliding window, add next - remove first - find max

        long sum = 0;
        for(int i = 0; i < k; i++){
            sum+= nums[i];
        }
        long max = sum;

        for(int j = k; j < nums.length; j++){
            sum += nums[j] - nums[j-k];
            max = Math.max(max, sum);
        }
        return max * 1.0/k;

    }

    public static  int removeDuplicates(int[] nums) {
        int fast = 2;

        for(int slow = 2; slow < nums.length;  slow++){
            if(nums[slow] != nums[fast-2]){
                nums[fast++] = nums[slow];
            }
        }
        return fast;
    }

    public static int removeElement(int[] nums, int val) {
        int idx =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[idx] = nums[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return idx;

    }

    public String longestCommonPrefix(String[] strs) {
        //use sort, compare first and last

        return "";
    }


    public static int minSubArrayLen(int target, int[] nums) {// 1 2 2 3 3 4  t =7
        int pSum = 0;
        int start = 0;
        int minL = Integer.MAX_VALUE;
        int n = nums.length;

        if(n < 1){
            return 0;
        }

        for(int end = 0; end < n; end++){
            if(pSum < target){
                pSum += nums[end];
            }
            while(pSum >= target){
                minL = Math.min(minL, end - start + 1);
                pSum -= nums[start++];
            }
        }
        if(minL == Integer.MAX_VALUE){
            return 0;
        }
        return minL;

    }

    // Fills prefix sum array
    static void fillPrefixSum(int arr[], int n,
                              int prefixSum[])
    {
        prefixSum[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    // Driver code

}
