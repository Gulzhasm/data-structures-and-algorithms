package practices.search.binary;


public class InfiniteSortedArraySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5,7, 9,10,90,100,130,140,160,170};
        int target = 10;
        int ans = findingAnswer(arr, target);
        System.out.println(ans);
    }


    static int findingAnswer(int[] arr, int target) {
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is the new start
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return infiniteArraySearch(arr, target, start, end);
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
}
