package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Misc {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int xor;

        for(int i = 1; i < nums.length; i++){
            sum += nums[0] + nums[i];
            xor = nums[i] ^ nums[i-1];
            sum += xor;
        }
        return sum;
    }
}
