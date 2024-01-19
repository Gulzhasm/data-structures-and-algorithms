package leetcode.stack;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElement(nums1, nums2);
        //System.out.println(Arrays.toString(ans));
        System.out.println(longestSubstring("abchjklbcbb"));

    }

    //Algorithm Design: Design an algorithm to find the longest substring without repeating characters in a given string.
    static String longestSubstring(String s) { //bcbbabc
        if (s == null || s.length() == 0) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        int maxStart = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current) && map.get(current) >= start) {
                start = map.get(current) + 1;
            }
            map.put(current, i);

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                maxStart = start;
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int num : nums2) {
                stack.push(num);
                int greater = stack.pop();
                if (nums1[i] < greater) {
                    ans[i] = greater;
                    break;
                } else {
                    ans[i] = -1;
                }
            }

        }
        return ans;
    }


    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}