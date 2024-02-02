package leetcode.challenges.february;

import java.util.ArrayList;
import java.util.List;

public class Feb2 {
    //Input: low = 1000, high = 13000
    //Output: [1234,2345,3456,4567,5678,6789,12345]
    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000, 13000));

    }

    public int[] sortArrayByParity(int[] nums) {
        int N = nums.length;
        int[] ans = new int[N];
        int j = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[j] = num;
                j++;
            }
        }

        for (int num : nums) {
            if (num % 2 != 0) {
                ans[j] = num;
                j++;
            }
        }
        return ans;
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = new int[]{12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789};

        for (int num : nums) {
            if (num < low) continue;
            if (num > high) break;

            ans.add(num);
        }
        return ans;
    }


}
