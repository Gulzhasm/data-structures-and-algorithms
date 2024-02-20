package leetcode.challenges.february;

import java.util.*;

public class Feb20 {

    //Input: gain = [-5,1,5,0,-7] -5 -
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1. -4 +5
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = Integer.MIN_VALUE;
        int[] alts = new int[n + 1];
        alts[0] = 0;
        int j = 1;
        for (int i = 0; i < n; i++) {
            alts[j] = gain[i] + alts[i];
            j++;
        }
        for (int num : alts) {
            max = Math.max(max, num);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64, -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81}));
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        List<Integer> curr = new ArrayList<>();
        for (int num : nums2) {
            if (!map.containsKey(num)) {
                curr.add(num);
            } else {
                map.remove(num);
            }
        }
        ans.add(curr);
        List<Integer> curr1 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            curr1.add(entry.getKey());
        }
        ans.add(curr1);
        return ans;
    }
}
