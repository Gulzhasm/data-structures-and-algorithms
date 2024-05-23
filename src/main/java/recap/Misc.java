package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Misc {

    private HashMap<Integer, Integer> freq;

    private int beautifulSubsets(int[] nums, int k, int i) {
        if (i == nums.length) { // base case
            return 1;
        }
        int result = beautifulSubsets(nums, k, i + 1); // nums[i] not taken
        if (!freq.containsKey(nums[i] - k) && !freq.containsKey(nums[i] + k)) { // check if we can take nums[i]
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            result += beautifulSubsets(nums, k, i + 1); // nums[i] taken
            freq.put(nums[i], freq.get(nums[i]) - 1);
            if (freq.get(nums[i]) == 0) {
                freq.remove(nums[i]);
            }
        }
        return result;
    }

    public int beautifulSubsets(int[] nums, int k) {
        freq = new HashMap<Integer, Integer>();
        return beautifulSubsets(nums, k, 0) - 1; // -1 for empty subset
    }

    public List<List<String>> partition(String s) {
        // Backtracking
        // Edge case
        if(s == null || s.length() == 0) return new ArrayList<>();

        List<List<String>> result = new ArrayList<>();
        helper(s, new ArrayList<>(), result);
        return result;
    }
    public void helper(String s, List<String> step, List<List<String>> result) {
        // Base case
        if(s == null || s.length() == 0) {
            result.add(new ArrayList<>(step));
            return;
        }
        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue; // only do backtracking when current string is palindrome

            step.add(temp);  // choose
            helper(s.substring(i, s.length()), step, result); // explore
            step.remove(step.size() - 1); //
        }
        return;
    }
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right --;
        }
        return true;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int xor;

        for(int i = 1; i < nums.length; i++){
            sum += nums[0] + nums[i];
            xor = nums[i] ^ nums[i-1];
            sum += xor;
        }
        return sum;
    }
}
