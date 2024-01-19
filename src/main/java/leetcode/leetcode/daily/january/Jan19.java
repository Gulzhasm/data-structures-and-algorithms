package leetcode.leetcode.daily.january;

import java.util.*;

public class Jan19 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        //        Output: [2,3]

        System.out.println(findDuplicates(nums));


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
