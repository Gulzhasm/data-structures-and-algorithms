package leetcode.assignments.arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        String s = "-42";
        int[] a = {1,2,0,3,4}; //[24,12,8,6]
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;

        double result = 0.0;
        int sign = 1;
        boolean numberStarted = false;

        for (char c : str.toCharArray()) {
            if (numberStarted && !Character.isDigit(c))
                break;

            if (c == '+') {
                sign = 1;
                numberStarted = true;
            } else if (c == '-') {
                sign = -1;
                numberStarted = true;
            } else if (Character.isDigit(c)) {
                result = result * 10 + c - '0';
                numberStarted = true;
            } else if (c != ' ') {
                return 0;
            }
        }

        result *= sign;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) result;
    }

    public static int myAtoi1(String s) {
        char[] c = s.trim().replaceAll("[a-zA-Z]", "").toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < c.length; i++){
           if(Character.isDigit(c[i])){
               builder.append(c[i]);
           }
           if(c[i] == '-'){
              builder.insert(0, c[i]);
           }
           }
        return Integer.parseInt(builder.toString());
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mult = 1, s = 1;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = mult;
            mult = mult * nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * s;
            s = s * nums[i];
            System.out.println(s);
        }

        return answer;
    }

    public static int[] prefixSum(int[] a) {
        int[] prefixSum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            prefixSum[i] = a[i];
            if (i > 0)
                prefixSum[i] += prefixSum[i - 1];
        }
        return prefixSum;
    }
}
