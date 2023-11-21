package bootcamp.search.binary;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 9, 11};
        int target = 4;
        int[] ans = searchInRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
