package practices.bitwise;

import practices.oop.access.A;

import java.util.*;

public class BitWise {
    public static void main(String[] args) {
        int n = 68;
        //System.out.println(isOdd(n));
        int[] arr = {3,2,1,5,6,4}; // 1 2 2 3 3 4 5 5 6

        //System.out.println(singleNumber(arr));
        //System.out.println(getSum(2, 3));
        System.out.println(findKthLargest(arr, 2));
    }
/*
Example 1:

Input: nums = [3,2,1,5,6,4], k = 2 // 1 2 3 4 5 6
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 //1 2 3 4 5 6
Output: 4

 */
    public static int findKthLargest(int[] nums, int k) { //1 2 3 4 5 6
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int subsetXORSum(int[] nums) {
        int sum = 0;
        int xor;

        for (int i = 1; i < nums.length; i++) {
            sum += nums[0] + nums[i];
            xor = nums[i] ^ nums[i - 1];
            sum += xor;
        }
        return sum;
    }

    public static int singleNumber(int[] nums) {// num^num=0
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static int getSum(int a, int b) {
        int keep = (a & b) << 1;
        int res = a ^ b;

        if (keep == 0)
            return res;

        return getSum(keep, res);
    }


    /*
    Input: pref = [5,2,0,3,1]
    Output: [5,7,2,3,2]
    Explanation: From the array [5,7,2,3,2] we have the following:
    - pref[0] = 5.
    - pref[1] = 5 ^ 7 = 2.
    - pref[2] = 5 ^ 7 ^ 2 = 0.
    - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
    - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
     */
    public static int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        ans[0] = pref[0];

        for (int i = 1; i < n; i++) {
            ans[i] = pref[i] ^ pref[i - 1];
        }
        return ans;
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    //find the number which appears only once using XOR
    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int xor = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            xor ^= nums[i];
        }
        return xor;
    }
}
