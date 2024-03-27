package leetcode.topicWise.arrays.slidingWindow;

public class Solution {
    public static void main(String[] args) {
       int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3}; int k = 19;
        System.out.println(numSubarrayProductLessThanK(nums, k));
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
