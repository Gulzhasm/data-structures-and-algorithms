package leetcode.topicWise.arrays;

import java.util.*;

public class Array {

    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int n : n1){
            s1.add(n);
        }

        for(int n : n2){
            if(s1.contains(n)) s2.add(n);
        }

        int[] ans = new int[s2.size()];
        int i =0;

        for(int n : s2){
            ans[i++] = n;
        }
        return ans;
    }


    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int freq = 0, max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) freq = max = entry.getValue();
            else if (max == entry.getValue()) freq += max;
        }
        return freq == 0 ? map.size() : freq;
    }

    public int getCommon(int[] n1, int[] n2) {
        int  i = 0, j = 0;

        while(i < n1.length && j < n2.length){
            if(n1[i] < n2[j]) i++;
            else if(n1[i] > n2[j]) j++;
            else if(n1[i] == n2[j]) return n1[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOddLengthSubarrays(new int[]{1,4,2,5,3})));

    }

    public static  int[] sumOddLengthSubarrays(int[] arr) {
        int N = arr.length;
        int[] pSum = new int[N];
        pSum[0] = arr[0];

        for(int i = 1; i < N; i++){
            int prev = pSum[i-1];
                pSum[i] = prev +arr[i];
        }
     return pSum;
    }
}
