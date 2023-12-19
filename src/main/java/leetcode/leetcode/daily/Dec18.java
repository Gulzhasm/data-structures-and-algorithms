package leetcode.leetcode.daily;

import java.util.Arrays;

public class Dec18 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5}; // 0 1 2 3 4
        String word1 = "ab", word2 = "pqrs";

        // System.out.println(maxProductDifference(arr));  word1 = "abcd", word2 = "pq" "apbqcd"
        //Input: word1 = "ab", word2 = "pqrs"
        //Output: "apbqrs"
        //System.out.println(mergeAlternately(word1, word2));
        System.out.println(findAnyRepeatedNumber(arr));
    }

    static int findAnyRepeatedNumber1(int[] arr) { //O(NlogN)
        int repeated = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                repeated = arr[i];
                break;
            }
        }

        return repeated;
    }

    static int findAnyRepeatedNumber(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return fast;
    }

    //O(N)
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        int l1 = word1.length();
        int l2 = word2.length();

        while (p1 < l1 && p2 < l2) {
            sb.append(word1.charAt(p1)).append(word2.charAt(p2));
            p1++;
            p2++;
        }
        if (l1 > l2) {
            sb.append(word1.substring(l2));
        } else if (l2 > l1) {
            sb.append(word2.substring(l1));
        }
        return sb.toString();
    }

    //with sorting O(NlogN)
    public static int maxProductDifferenceSort(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }

    public static int maxProductDifference(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > fMax) {
                sMax = fMax;
                fMax = num;
            } else if (num > sMax && num < fMax) {
                sMax = num;
            }
            if (num < fMin) {
                sMin = fMin;
                fMin = num;
            } else if (num < sMin && num > fMin) {
                sMin = num;
            }
        }

        return (fMax * sMax) - (fMin * sMin);
    }



}
