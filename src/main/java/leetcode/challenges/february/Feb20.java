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
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n1: nums1){
            set1.add(n1);
        }
        for(int n2: nums2){
            set2.add(n2);
        }
        List<Integer> l1 = new ArrayList<>();

        for(int s : set1){
            if(!set2.contains(s)){
                l1.add(s);
            } else {
                set2.remove(s);
            }
        }

        List<Integer> l2 = new ArrayList<>(set2);
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
