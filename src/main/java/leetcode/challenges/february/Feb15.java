package leetcode.challenges.february;

public class Feb15 {
    //Input: nums = [5,7,7,8,8,10], target = 8 0 1 2 3 4
    //Output: [3,4]
    //Example 2:
    //
    //Input: nums = [5,7,7,,8,8, 9, 10], target = 9
    //Output: [-1,-1]
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findSecond(nums, target);
        return ans;
    }

    private int findFirst(int[] a, int key) {
        int lo = 0, hi = a.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) {
                lo = mid + 1;
            } else if (a[mid] > key) {
                hi = mid - 1;
            } else {
                idx = mid;
                hi = mid - 1;
                // because nothing after mid
                // can be the first occurrence of target.
                //maybe mid is the first occurrence , maybe not
                //so let's narrow the target for [0...mid-1] and find out
            }
        }
        return idx;
    }

    private int findSecond(int[] a, int key) {
        int lo = 0, hi = a.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) {
                lo = mid + 1;
            } else if (a[mid] > key) {
                hi = mid - 1;
            } else {
                idx = mid;
                // because nothing before mid
                // can be the last occurrence of target.
                //maybe mid is the last occurrence , maybe not
                //so let's narrow the target for [mid+1...high] and find
                lo = mid + 1;
            }
        }
        return idx;
    }
}
