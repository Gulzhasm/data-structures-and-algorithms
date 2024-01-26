package leetcode.challenges.december;

public class Dec28 {
    public static void main(String[] args) {
        Dec28 dec = new Dec28();
        int[] arr = {2, 2, 2, 2, 2}; //  [1,2,3,1]
        System.out.println(dec.allItemsSame(arr));
    }

    //two pointers
    boolean allItemsSame(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
        }
        return true;
    }

    //Input: nums = [1,3, 2, 4,5,6,7,5,4]
    //Output: 5
    //Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0; // single element

        int n = nums.length;

        // check if 0th/n-1th index is the peak element
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        // search in the remaining array
        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] < nums[mid - 1]) end = mid - 1;
            else if (nums[mid] < nums[mid + 1]) start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) { //3, 4, 7, 12,
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int findCorrectIndex(int[] nums, int target) {
        int l = nums.length;
        int index = 0;

        if (target >= nums[l - 1]) {
            return l;
        }
        for (int i = 0; i < l; i++) {
            if (target > nums[i] && target < nums[i + 1]) {
                index = i + 1;
            }

        }

        return index;
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target <= nums[mid]) {
                end = mid - 1;
            } else if (target >= nums[mid]) {
                start = mid + 1;
            }
        }

        return findCorrectIndex(nums, target);
    }


    //1. binary search // [0,2,1,0]
    // 4 cases - 1. mid > start and mid > end
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
