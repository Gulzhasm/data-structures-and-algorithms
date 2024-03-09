package leetcode.topicWise.arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));

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
}
