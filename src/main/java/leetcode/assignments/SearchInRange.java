package leetcode.assignments;

//34. Find First and Last Position of Element in Sorted Array
class SearchInRange {
    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        int last = -1;

        while (start < end) {
            int midX = start + (end - start) / 2;
            if (target < nums[midX]) {
                end = midX - 1;
            } else if (target > nums[midX]) {
                start = midX + 1;
            } else if (target == nums[midX]) {
                first = midX;
                last = midX;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while (last > nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
            }
        }
        return new int[]{first, last};
    }
}