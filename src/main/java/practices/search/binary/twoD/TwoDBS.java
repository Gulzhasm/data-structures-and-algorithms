package practices.search.binary.twoD;

import java.util.Arrays;

public class TwoDBS {
    //linear search for 2D array's time complexity is going to be O(n^2)
    //if 2D array's every row and every column is sorted, then you can apply BS
    public static void main(String[] args) {
        int[][] arr1 = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(searchBSin2D(arr1, 29)));

    }

    static int[] searchBSin2D(int[][] arr, int target) {

        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
