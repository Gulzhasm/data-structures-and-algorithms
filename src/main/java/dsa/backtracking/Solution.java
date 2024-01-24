package dsa.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr, 4));

    }

    public static  double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }
        long max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / 1.0 / k;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            while (j < nums.length) {
                sum += nums[j];
                j++;
                if(sum == k){
                    count++;
                    break;
                }
            }

        }
        return count;
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int j = 2; j < s.length(); j++) {
            Set<Character> set = new HashSet<>();
            int i = j - 2;
            while (i <= j) {
                set.add(s.charAt(i));
                i++;
            }
            if (set.size() == 3) {
                count++;
            }
        }
        return count;
    }

    public int maxLength(List<String> arr) {
        Set<String> set = arr.stream().filter(this::unique).collect(Collectors.toSet());
        backtrack(arr, set, 0, new StringBuilder());
        int max = 0;
        for (String word : set) max = Math.max(max, word.length());
        return max;
    }

    private void backtrack(List<String> arr, Set<String> set, int i, StringBuilder sb) {
        if (i == arr.size()) {
            String word = sb.toString();
            if (unique(word)) set.add(word);
            return;
        }

        int len = sb.length();
        sb.append(arr.get(i));
        backtrack(arr, set, i + 1, sb);
        sb.setLength(len);

        backtrack(arr, set, i + 1, sb);
    }

    private boolean unique(String word) {
        Set<Character> set = new HashSet<>();
        for (char c : word.toCharArray()) set.add(c);
        return set.size() == word.length();
    }
}
