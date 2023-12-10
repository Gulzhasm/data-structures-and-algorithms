package leetcode.assignments.arrays;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int m = 1; int s =0;
        while (n > 0) {
            int last = n % 10;
            s += last;
            m *= last;
            n = n/10;
        }
        return m - s;
    }
}
