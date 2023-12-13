package leetcode.assignments.arrays;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = 0; i < m; i++) {
            nums1[k] = nums1[i];
            k++;
        }
        for(int j = 0; j < n; j++){
            nums1[k] = nums2[j];
            k++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
