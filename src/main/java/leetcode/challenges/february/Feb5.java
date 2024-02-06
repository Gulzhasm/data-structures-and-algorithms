package leetcode.challenges.february;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Feb5 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = nums.clone();
        int count= 0;

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums); //1 2 2 3 8

        for(int i = 0; i < nums.length;){
            if(i == nums.length-1 || nums[i] != nums[i+1]) {
                map.put(nums[i], count);
                count =(i+1);
            }
            i++;
        }

        for(int i = 0; i < nums.length; i++) {
           ans[i] = map.get(ans[i]);
        }
        return ans;
    }

    public int firstUniqCharFreq(String s) {
        if (s.length() == 0) return -1;
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
