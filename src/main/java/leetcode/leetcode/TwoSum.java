package leetcode.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {5, 25, 75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        if (numbers.length == 0) {
            return output;
        }
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[j] + numbers[i] == target) {
                output[0] = j+1;
                output[1] = i+1;
            }
            j++;
        }
        return output;
    }
}
