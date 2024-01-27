package leetcode.challenges.january;

import java.util.*;

public class Jan27 {
    //Input: nums = [10,2]
    //Output: "210"
    //Example 2:
    //
    //Input: nums = [3,30,34,5,9]
    //Output: "9534330"
    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
         largestNumber(arr);

    }

    public  static void largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        // 2.Sort in descending order
        Arrays.sort(strs, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));
        System.out.println(Arrays.toString(strs));
    }

    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num >= original) {
                set.add(num);
            }
            while (set.contains(original)) {
                original = 2 * original;
            }

        }
        return original;
    }

    public boolean checkIfExistSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(2 * arr[i]) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public boolean checkIfExistMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(2 * arr[i]) || (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;

    }

    public boolean checkIfExistBF(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
