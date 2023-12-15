package leetcode.leetcode;

import practices.oop.access.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[][] mat = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        //  System.out.println(Arrays.deepToString(transpose(mat)));
        System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));

    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Integer.max(case1, case2);
    }

    public static int maximumProductTwoPointer(int[] nums) {
        int n = nums.length;
        int e = 3;
        int max = Integer.MIN_VALUE;
        if (n == 0) {
            return -1;
        }

        while(e <= n) {
            int sum = 1;
            for (int i = 0; i < e; i++) {
                sum *= nums[i];
            }if(n == 3){
                max = sum;
            } else {
                max = Math.max(max, sum);
            }
            e++;
        }

        return max;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] patternFreq = hashTable(p);
        if (s.length() < p.length()) {
            return ans;
        }
        int end = p.length();
        int[] sFreq = hashTable(s.substring(0, end));

        for (int i = 0, j = p.length(); j <= s.length(); ++i, ++j) {
            if (Arrays.equals(patternFreq, sFreq)) {
                ans.add(i);
            }

            --sFreq[s.charAt(i) - 'a'];
            if (j < s.length()) {
                ++sFreq[s.charAt(j) - 'a'];
            }
        }
        return ans;
    }

    private boolean isAnagram(char[] s, char[] t) {
        Arrays.sort(s);
        Arrays.sort(t);
        return Arrays.equals(s, t);
    }

    public List<Integer> findAnagram(String s, String p) {//  s = "cbaebabacd", p = "abc"
        List<Integer> ans = new ArrayList<>();
        int n = p.length();

        while (n <= s.length()) {
            char[] pStr = p.toCharArray();
            char[] sStr = s.toCharArray();
            if (isAnagram(Arrays.copyOfRange(sStr, n - p.length(), n), pStr)) {
                ans.add(n - p.length());
            }
            n++;
        }
        return ans;
    }

    public static boolean isAnagram1(String s, String t) {
        return Arrays.equals(hashTable(s), hashTable(t));
    }

    private static int[] hashTable(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++freq[s.charAt(i) - 'a'];
        }
        return freq;
    }


    public static boolean isPerfectSquare(int num) {
        return Math.pow(num, 0.5) % 1 == 0;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                ans[row][col] = matrix[col][row];
            }
        }
        return ans;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat[0].length - 1;
        for (int row = 0; row < mat.length; row++) {
            sum += mat[row][row] + mat[row][n--];
        }
        int m = mat.length;
        if (mat.length % 2 == 1) {
            sum = sum - mat[m / 2][m / 2];
        }
        return sum;
    }

    /*
    [[7,9,8,6,3],
    [3,9,4,5,2],
    [8,1,10,4,10],
    [9,5,10,9,6],
    [7,2,4,10,8]]
     */
}


