package leetcode.challenges.february;

import java.util.Arrays;

public class Feb4 {


    //Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//
//Return any answer array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: nums = [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] 0 1 2 3 would also have been accepted.
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int N = nums.length;
        int odd = -1, even = -2;

        for (int i = N - 1; i >= N/2; i--) {
            if (nums[i] % 2 != 0) {
                odd +=2;
                int temp = nums[odd];
                nums[odd] = nums[i];
                nums[i] = temp;
            } else {
                even+=2;
                int temp = nums[even];
                nums[even] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;

    }

    public static int[] sortArrayByParityI(int[] nums) {
        int N = nums.length;
        int odd = 1;

        for (int i = N - 1; i >= N / 2; i--) {
            if (nums[i] % 2 != 0) {
                int temp = nums[odd];
                nums[odd] = nums[i];
                nums[i] = temp;
                odd += 2;
            }
        }
        return nums;

    }

    public static int[] sortArrayByParity(int[] nums) {
        int N = nums.length;
        int[] ans = new int[N];
        int s = 0, e = N - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[s] = num;
                s++;
            } else {
                ans[e] = num;
                e--;
            }
        }
        return ans;
    }

    public static int thirdMax(int[] nums) {
        Integer f = null, s = null, t = null;
        for (int num : nums) {
            if (f == null || num > f) {
                t = s;
                s = f;
                f = num;
            } else if (num == f) continue;
            else if (s == null || num > s) {
                t = s;
                s = num;
            } else if (num == s) continue;
            else if (t == null || num > t) {
                t = num;
            }
        }
        if (t != null) return t;
        else return f;
    }


}
