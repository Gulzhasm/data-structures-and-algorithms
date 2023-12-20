package leetcode.leetcode.earlier;

import java.util.Arrays;

// leetcode -167
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {5, 25, 75};
        int target = 100;
        System.out.println(Arrays.toString(twoSumTwoPointers(numbers, target)));
    }


    static int[] twoSumTwoPointers(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        while (s < e) {
            if (numbers[s] + numbers[e] > target) {
                e--;
            } else if (numbers[s] + numbers[e] < target) {
                s++;
            } else if (numbers[s] + numbers[e] == target) {
                return new int[]{s + 1, e + 1};
            }

        }
        return new int[]{-1, -1};
    }


    static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        if (numbers.length == 0) {
            return output;
        }
        int j = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[j] + numbers[i] == target) {
                output[0] = j + 1;
                output[1] = i + 1;
            }
            j++;
        }
        return output;
    }
}
