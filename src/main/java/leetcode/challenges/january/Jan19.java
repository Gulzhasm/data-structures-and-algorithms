package leetcode.challenges.january;

import java.util.*;

public class Jan19 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2};
        //2 3 3 4 5 6  i+1 !=j
        //2 2 i+1 != nums[i]

        //        Output: 4,3,2,7,8,2,3,1 ->5,6


    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                ans[0] = nums[i];
            }
            set.add(nums[i]);
        }

        //find what is missing
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }


    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                ans.add(num);
            } else {
                map.put(num, 1);
            }
        }
        return ans;
    }

    public static char findTheDifference(String s, String t) {
        //Do Not forget XOR for unique or different elements
        if (s.length() == 0 && t.length() > 0) {
            return t.charAt(0);
        }
        char unique = 0;

        for (char sch : s.toCharArray()) unique ^= sch;
        for (char tch : t.toCharArray()) unique ^= tch;

        return unique;

    }
}
