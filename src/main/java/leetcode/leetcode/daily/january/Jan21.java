package leetcode.leetcode.daily.january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan21 {

    //Input: nums = [3,5,2,3]
    //Output: 7
    //Explanation: The elements can be paired up into pairs (3,3) and (5,2).
    //The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reversePrefix(s, 'z'));
    }

    public static String reversePrefix(String word, char ch) {

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        for (int i = index; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        if (index < 1) {
            sb = new StringBuilder(word);
        }

        return sb.toString();
    }

    public static int minPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int s = 0, e = nums.length - 1, sum = 0;

        while (s <= e) {
            sum = nums[s] + nums[e];
            s++;
            e--;
            max = Math.max(max, sum);
        }

        return max;

    }

    public static int minPairSumSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int s = 0, e = nums.length - 1, sum = 0;

        while (s <= e) {
            sum = nums[s] + nums[e];
            s++;
            e--;
            max = Math.max(max, sum);
        }

        return max;
    }


}
