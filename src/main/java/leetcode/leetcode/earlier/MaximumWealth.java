package leetcode.leetcode.earlier;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {1, 2, 4},
        };
        System.out.println(maximumWealth(arr));

    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            int tempSum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                tempSum += accounts[row][col];
            }
            if (tempSum > max){
                max = tempSum;
            }
        }
        return max;
    }
}