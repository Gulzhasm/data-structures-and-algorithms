package leetcode.challenges.january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan22 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j = 0; i < g.length && j < s.length; j++){
            if(s[j] >= g[i]){
                i++;
            }
        }
        return i;

    }
    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j <a.length; j++) {
                List<Integer> current = new ArrayList<>();
                int k = bs(a, -(a[i] + a[j]));
                if(k != -1){
                    if((a[i] + a[j]) + a[k] == 0){
                        current.add(a[i]);
                        current.add(a[j]);
                        current.add(a[k]);
                    }
                }
                ans.add(current);
            }
        }
        return ans;
    }

    private int bs(int[] nums, int key){
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(nums[mid] < key){
               lo = mid+1;
            } else if(nums[mid] > key){
                hi = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
