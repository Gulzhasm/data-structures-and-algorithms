package leetcode.challenges.february;

import dsa.graph.algos.MAin;

import java.util.ArrayList;
import java.util.List;

public class Feb9 {
    public static void main(String[] args) {
        int[] arr ={2,5,6,9,10};
       // System.out.println(findGCD(arr));

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>  ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int c : candies){
            max = Math.max(max, c);
        }

        for(int c : candies){
            if(c + extraCandies >= max){
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

    private  int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
