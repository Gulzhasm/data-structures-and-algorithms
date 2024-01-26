package leetcode.challenges.january;


import java.util.*;

public class Jan25 {
    public static void main(String[] args) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> sorted = new LinkedList<>(map.keySet());
        Collections.sort(sorted, (a, b) -> map.get(b) - map.get(a));
        for (int i = 0; i < k; i++) {
            ans[i] = sorted.get(i);
        }
        return ans;
    }


}
