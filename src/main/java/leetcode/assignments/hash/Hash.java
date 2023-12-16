package leetcode.assignments.hash;

import practices.oop.access.A;

import java.util.*;

public class Hash {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        String pattern = "abba", s = "cat dog fish cat";
        //System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        // System.out.println(Arrays.toString(intersection(nums1, nums2)));
        //System.out.println(wordPattern(pattern, s));
        System.out.println(subarraySum(new int[]{1,2,3}, 3));
    }
    /*
    Input: nums = [1,1,1], k = 2
Output: 2
     */

    public static int subarraySum(int[] nums, int k) {
     Map<Integer, Integer> map = new HashMap<>();
     int count = 0;

     for(int i = 0; i < nums.length; i++){
         int potentialMatch = k - nums[i];
         if(k == nums[i]){
             count+=1;
         }
         if(map.containsKey(potentialMatch)){
             count++;
         } else {
             map.put(nums[i], i);
         }
     }
     return count;
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        if (words.length != pattern.length()) return false;

        Map<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false;
            }
        }
        return true;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{-1, -1};
        }

        for (int num1 : nums1) {
            set1.add(num1);
        }

        for (int nums : nums2) {
            if (set1.contains(nums)) {
                set2.add(nums);
            }
        }
        int[] ans = new int[set2.size()];
        int index = 0;
        for (Integer ints : set2) {
            ans[index++] = ints;
        }
        return ans;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if (nums.length == 0) {
            return false;
        }
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public boolean containsDuplicateWithSort(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
