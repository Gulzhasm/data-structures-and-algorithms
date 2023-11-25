package bootcamp.sort.interviewQs;

public class FindDuplicate {

    int findDuplicate(int[] nums) {
        //cyclic sort
        int i = 0;
        while (i < nums.length) { //2 1
            if (nums[i] != i + 1) {
                int correct = nums.length - 1;
                if (nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
