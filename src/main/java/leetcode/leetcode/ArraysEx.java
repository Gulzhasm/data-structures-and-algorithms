package leetcode.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[][] mat = {
                {2,4,-1},
                {-10,5,11},
                {18,-7,6}
        };
        System.out.println(Arrays.deepToString(transpose(mat)));
    }


    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                ans[row][col] = matrix[col][row];
            }
        }
        return ans;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] +k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat[0].length - 1;
        for (int row = 0; row < mat.length; row++) {
            sum += mat[row][row] + mat[row][n--];
        }
        int m = mat.length;
        if (mat.length % 2 == 1) {
            sum = sum - mat[m/2][m/2];
        }
        return sum;
    }

    /*
    [[7,9,8,6,3],
    [3,9,4,5,2],
    [8,1,10,4,10],
    [9,5,10,9,6],
    [7,2,4,10,8]]
     */
}
