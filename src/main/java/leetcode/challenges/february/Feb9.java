package leetcode.challenges.february;


import java.util.ArrayList;
import java.util.List;

public class Feb9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // System.out.println(findGCD(arr));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int c : candies) {
            max = Math.max(max, c);
        }
        for (int c : candies) {
            if (c + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    public static void rotateBF(int[] nums, int k) { // this code does not cover all edge cases, but works
        int N = nums.length;
        int[] ans = new int[N];
        int idx = 0;

        for(int i = N-k; i < N; i++){
            ans[idx] = nums[i];
            idx++;
        }

        for(int i = 0; i < N-k; i++){
            ans[idx] = nums[i];
            idx++;
        }
        System.arraycopy(ans, 0, nums, 0, N);
    }

}
