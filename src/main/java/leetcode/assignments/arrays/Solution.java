package leetcode.assignments.arrays;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }

    //Output: 5
//Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
    public static int maxScore(String s) {
        int ans = 0;
        int len = s.length();

        int ones = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        int zeros = 0;
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }
            int totalCount = zeros + ones;
            if (ans < totalCount) ans = totalCount;
        }

        return ans;
    }

    void prefixSum() {
        int[] a = {5, 7, 8, 9, -1, 3};

        int[] prefixSum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            prefixSum[i] = a[i];
            if (i > 0)
                prefixSum[i] += prefixSum[i - 1];
        }

        int[] arr = {-1, 1, 0, -3, 3}; // 1 2 2 3 3 4 5 5 6
    }

    //Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
    public int[] productExceptSelfOptimal(int[] nums) {
        int[] ans = new int[nums.length];
        int leftprod = 1;
        int rightprod = 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = leftprod;
            leftprod *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * rightprod;
            rightprod *= nums[i];
        }

        return ans;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        while (index < nums.length) {
            int prod = 1;
            for (int i = 0; i < nums.length; i++) {
                if (index == i) {
                    continue;
                }
                prod *= nums[i];
            }
            ans[index] = prod;
            index++;
        }
        return ans;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public static boolean containsDuplicate(int[] nums) {
        bubble(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        int index = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] / 5 == 1) {
                count5++;
                index++;
            }
            if (bills[i] / 5 == 2) {
                count10++;
                count5--;
            }

        }
        return true;
    }

    public static int subtractProductAndSum(int n) {
        int m = 1;
        int s = 0;
        while (n > 0) {
            int last = n % 10;
            s += last;
            m *= last;
            n = n / 10;
        }
        return m - s;
    }
}
