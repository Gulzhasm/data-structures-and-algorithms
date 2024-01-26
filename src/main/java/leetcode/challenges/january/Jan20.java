package leetcode.challenges.january;

import java.util.HashSet;
import java.util.Set;

public class Jan20 {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n1 = 0, n2 =0;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num1: nums1){
            set1.add(num1);
        }

        for(int num2 : nums2){
            set2.add(num2);
            if(set2.contains(num2)){
                n2++;
            }
        }

        for(int num1 : nums1){
            if(set2.contains(num1)) {
                n1++;
            }
        }
        return  new int[] {n1, n2};
    }

    public int[] findIntersectionValuesBF(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int n1 = 0, n2 =0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    n1++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    n2++;
                    break;
                }
            }
        }
        ans[0] = n1;
        ans[1] = n2;

        return ans;
    }
}
