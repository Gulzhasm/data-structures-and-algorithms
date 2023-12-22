package leetcode.assignments.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveNumbers {
    public static void main(String[] args) {
        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        //Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
        System.out.println(containsNearbyDuplicateWithMap(new int[]{99,1,2,99}, 3)); //0 3
    }

    //Input: nums = [1,2,3,1], k = 3
    //Output: true
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j+=k) {
                if (nums[i] == nums[j] && i != j && Math.abs(i - j) <= k) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean containsNearbyDuplicateWithMap(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) -i) <= k){
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) { //O(N)
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }


}
