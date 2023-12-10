package leetcode.assignments.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(isPalindrome("`l;``1o1??;l`"));
                reverseString(new char[] {'h', 'e', 'l', 'l', 'o'});
    }

    public static  boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{IsPunctuation}|\\s+", "").replaceAll("`", "").toLowerCase();
        System.out.println(s);
        if(s.isBlank() || s.equals(" ")) return true;

        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i < s.length/2; i++, j--){
            char output = s[i];
            s[i] = s[j];
            s[j] = output;
        }
    }
    public static int thirdMax(int[] nums) {
        int count = 0;
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > f){
                f = nums[i];
            } else if(nums[i] > s){
                if(f != s){
                    s = nums[i];
                }
            } else if(nums[i] > t){
                if(s != t) {
                    t = nums[i];
                    count++;
                }
            }
        }
        return count;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();

        for (int i = 0; i < jewel.length; i++) {
            for (int j = 0; j < stone.length; j++) {
                if (jewel[i] == stone[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add(i - 1, "FizzBuzz");
            } else if (i % 5 == 0) {
                ans.add(i - 1, "Buzz");
            } else if (i % 3 == 0) {
                ans.add(i - 1, "Fizz");
            } else {
                ans.add(i - 1, String.valueOf(i));
            }
        }
        return ans;
    }
}
