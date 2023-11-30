package practices.search.linear;

public class TwoDArraySearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {6, 2, 3},
                {8, 9, 34353}
        };

        int[] ans = search(arr, 9);
        //System.out.println(Arrays.toString(ans));
        System.out.println(maximumWealth(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int findEven2DigitsNumbers(int[] nums) { // 12/10 = 1
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 10 > 0 && nums[i] / 10 <= 9 && nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int countDigitsInNumbers(int[] array) { // 12, 123, 1234
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            while (n > 0) {
                count++;
                n = n / 10;
            }
            System.out.println(array[i] + " has " + count + " digit(s)");
            count = 0;
        }
        return count;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    //check for Math.log10(num)???


    static int maximumWealth(int[][] accounts) {
        // [1, 2, 3]
        // [1,2]
        int highest = Integer.MIN_VALUE;
        int rowSum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum += accounts[i][j];
            }
            if (rowSum > highest) {
                highest = rowSum;
            }
        }
        return highest;
    }
}
