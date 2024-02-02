package leetcode.challenges.february;

import java.util.*;

public class Feb3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2; // formula of natural numbers sum
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int l = m + n - 1;

        while(j >=0){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[l] = nums1[i];
                i--;
            } else {
                nums1[l] = nums2[j];
                j--;
            }
            l--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static int majorityElement(int[] nums) {
        int majorOne = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                majorOne = entry.getKey();
            }
        }
        return majorOne;

    }
}
