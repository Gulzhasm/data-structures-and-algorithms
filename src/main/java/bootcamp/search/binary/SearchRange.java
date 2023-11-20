package bootcamp.search.binary;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 9, 11};
        int target = 8;
        int[] ans = searchInRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
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
