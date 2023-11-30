package practices.search.binary;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 9, 11, 10, 8, 3};
        int ans = findPeak(arr);
        System.out.println(ans);
    }


    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) { //3, 4, 7, 8, 9, 11 10, 8, 3
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; //start == end
    }

    static int searchInMountain(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = infiniteArraySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int infiniteArraySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) { // 3, 4, 7, 8, 9, 11 target =4
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) { //1,2,3,4,5,6
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // 6,5,4,3,2,1
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
