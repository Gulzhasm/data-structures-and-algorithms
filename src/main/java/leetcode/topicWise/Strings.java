package leetcode.topicWise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Strings {

    public int maxDepth(String s) {
        int count = 0, max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (max < count) {
                    max = count;
                }
            } else if (c == ')') count--;
        }
        return max;
    }

    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                while (count-- > 0) {
                    sb.append(c);
                    map.remove(c);
                }
            }
        }

        for (char ch : map.keySet()) {
            int count = map.get(ch);
            while (count-- > 0) sb.append(ch);
        }
        return sb.toString();

    }

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();

        for (char s : stones.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int ans = 0;
        for (char j : jewels.toCharArray()) {
            if (map.containsKey(j)) {
                int c = map.get(j);
                ans += c;
            }

        }

        return ans;
    }

    public int numSubarraysWithSum(int[] A, int S) {
        return atMost(A, S) - atMost(A, S - 1);
    }

    public int atMost(int[] A, int S) {
        if (S < 0) return 0;
        int res = 0, i = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            S -= A[j];
            while (S < 0)
                S += A[i++];
            res += j - i + 1;
        }
        return res;
    }
}

class Solution {

    public boolean checkValidStringq(String s) {
        int cmax = 0, cmin = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            }
            if (c == ')') {
                cmax--;
                cmin = Math.max(cmin - 1, 0);

            }
            if (c == '*') {
                cmax++;
                cmin = Math.max(cmin - 1, 0);
            }
            if (cmax < 0) return false;
        }

        return cmin == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }

    //Input: s = "(*))"
    //Output: true
    public static boolean checkValidString(String s) {
        //Stack<Character> stack = new Stack<>();
        int l = 0, r = 0, p = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') l++;
            if (c == ')') r++;
            if (c == '*') p++;
            if (r > l) r = r - l;
            else if (l > r) l = l - r;
        }
        System.out.println(l + " " + r + " " + p);

        return ((p == 0) && l == r) || (r > 0 && (p != 0 && r == p)) || (l > 0 && (p != 0 && p == l));

    }


    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int sum = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1;

        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }

        return totalCount;
    }
}