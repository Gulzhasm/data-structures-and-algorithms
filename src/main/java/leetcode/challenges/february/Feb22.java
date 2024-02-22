package leetcode.challenges.february;

import java.util.Arrays;

public class Feb22 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4,5,6,6};
        System.out.println(findDuplicate(A));

    }

    //Input: nums = 1 2 3 4 5 6 7 8 9 9
//Output: 3
    public static int findDuplicate(int[] A) {
        int n = A.length;
        int ans = 0, lo = 0, hi = n - 1;
        Arrays.sort(A);
        int idx = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A[mid] == A[mid + 1] || A[mid] == A[mid - 1]) {
                ans = A[mid];
                return ans;
        } else if((A[mid] < A[mid+1] && A[mid] > A[mid-1]) && A[mid] == mid){
            lo = mid +1;
        }

        }

        return ans;
    }

    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == n - 1) return i;
        }
        return -1;
    }
}
