package leetcode.assignments.arrays;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
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
