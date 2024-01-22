package practices.recursion.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseNumbers {

    public static void main(String[] args) {
        //  System.out.println(reverse(1234));
    }

    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int[] doubled = new int[2 * n];

         for(int i = 0; i < n; i++){
             doubled[i] = nums[i];
             doubled[n+i] = reverse(nums[i]);
         }

        for (int j : doubled) {
            set.add(j);
        }
         return set.size();
    }

    private int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            ans = ans * 10 + rem;
            x = x / 10;
        }
        return ans;
    }

    static int reversee(int n) {
        int digits = (int) (Math.log10(n)) + 1; //?
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
