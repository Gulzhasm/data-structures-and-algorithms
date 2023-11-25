package bootcamp.sort.interviewQs;


import java.util.Arrays;

//set mismatch
public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNumbers(arr)));
    }


    static int[] findErrorNumbers(int[] nums) {
     //cyclic sort -> swap
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //search for the missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
