package leetcode.leetcode.daily.january;

public class Jan24 {

    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));

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
