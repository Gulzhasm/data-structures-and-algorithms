package leetcode.challenges.december;

public class Dec27 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1});
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int index = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[index] = nums[j];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
